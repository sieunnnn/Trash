import pygame
import random

# 초기화 (반드시 필요)
pygame.init()

# 화면 크기 설정
screen_width = 480 # 가로 크기
screen_height = 640 # 세로 크기
screen = pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀 설정
pygame.display.set_caption("커비의 폭탄 피하기 대작전") # 게임 이름

# FPS
clock = pygame.time.Clock()

# 배경 이미지 불러오기
background = pygame.image.load(
    "C:/Users/시은/Desktop/GitHub/Python/Inflearn/python lecture(utilize)/making game/bomb game/resource/background.png")

# 스프라이트(캐릭터) 불러오기
character_default = pygame.image.load(
    "C:/Users/시은/Desktop/GitHub/Python/Inflearn/python lecture(utilize)/making game/bomb game/resource/default.png")
character_left = pygame.image.load(
    "C:/Users/시은/Desktop/GitHub/Python/Inflearn/python lecture(utilize)/making game/bomb game/resource/left.png")
character_right = pygame.image.load(
    "C:/Users/시은/Desktop/GitHub/Python/Inflearn/python lecture(utilize)/making game/bomb game/resource/right.png")
character_gameover = pygame.image.load(
    "C:/Users/시은/Desktop/GitHub/Python/Inflearn/python lecture(utilize)/making game/bomb game/resource/gameover.png")

character = character_default

character_size = character.get_rect().size  # 이미지의 크기를 구해온다.
character_width = character_size[0]  # 캐릭터의 가로크기
character_height = character_size[1]  # 캐릭터의 세로크기

character_x_pos = (screen_width / 2) - (character_width / 2)  # 화면 가로 절반 크기에 해당 하는 곳에 위치
character_y_pos = screen_height - 175  # 화면 세로  가장 아래에 위치

# 이동할 좌표
to_x = 0
to_y = 0

# 이동 속도
character_speed = 0.6

# 폭탄 캐릭터
bomb_default = pygame.image.load("C:/Users/시은/Desktop/GitHub/Python/Inflearn/python lecture(utilize)/making game/bomb game/resource/bomb.png")
bomb_explosion = pygame.image.load(
    "C:/Users/시은/Desktop/GitHub/Python/Inflearn/python lecture(utilize)/making game/bomb game/resource/explosion.png")


bomb = bomb_default
# 폭탄 캐릭터의 크기
bomb_size = bomb.get_rect().size # 이미지의 크기를 구해온다.
bomb_width = bomb_size[0] # 적 캐릭터의 가로크기
bomb_height = bomb_size[1] # 적 캐릭터의 세로크기

# 폭탄 캐릭터의 위치
bomb_x_pos = random.randint(0, (screen_width - bomb_width))
bomb_y_pos = 0
bomb_speed = 4

# 이벤트 루프
running = True # 게임이 진행중인가? 를 확인
while running:
    dt = clock.tick(60) # 게임화면의 초당 프레임수를 설정
    # 캐릭터가 1 초 동안에 100 만큼 이동해야 한다고 가정해보자.
    # 10 fps : 1 초 동안에 10 번 동작. 따라서 한번에 10 만큼 이동해야 한다.
    # 20 fps : 1 초 동안에 20 번 동작. 따라서 한번에 5 만큼 이동해야 한다.
    # 프레임 수가 달라졌다고 해서 속도가 달라지면 안된다.

    # 어떤 이벤트가 발생 하였는가?
    for event in pygame.event.get():

        # 창이 닫히는 이벤트가 발생 하였는가?
        if event.type == pygame.QUIT:
            # 게임이 진행 중이 아니다.
            running = False

        if event.type == pygame.KEYDOWN: # 키가 눌러졌는지 확인
            if event.key == pygame.K_LEFT: # 캐릭터를 왼쪽으로
                character = character_left
                to_x -= character_speed


            elif event.key == pygame.K_RIGHT: # 캐릭터를 오른쪽으로
                character = character_right
                to_x += character_speed

        if event.type == pygame.KEYUP: # 방향키를 떼면 멈춘다.
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                character = character_default
                to_x = 0

            elif event.key == pygame.K_UP or event.key == pygame.K_DOWN:
                character = character_default
                to_y = 0

    # 캐릭터 이동
    character_x_pos += to_x * dt
    character_y_pos += to_y * dt

    # 캐릭터가 배경을 벗어나지 않게 가로 경계값 처리
    if character_x_pos < 0:
        character_x_pos = 0
    elif character_x_pos > screen_width - character_width:
        character_x_pos = screen_width - character_width

    # 캐릭터가 배경을 벗어나지 않게 세로 경계값 처리
    if character_y_pos < 0:
        character_y_pos = 0
    elif character_y_pos > screen_height - character_height:
        character_y_pos = screen_height - character_height

    # 폭탄을 계속해서 생성하기 / 폭발 이미지 넣기
    bomb_y_pos += bomb_speed
    if bomb_y_pos == screen_height - 236:
        bomb = bomb_explosion
    if bomb_y_pos > screen_height - 235:
        pygame.time.delay(180)
        bomb = bomb_default
        bomb_y_pos = 0
        bomb_x_pos = random.randint(0, (screen_width - bomb_width))

    # 충돌 처리
    character_rect = character.get_rect()
    character_rect.left = character_x_pos
    character_rect.top = character_y_pos

    bomb_rect = bomb.get_rect()
    bomb_rect.left = bomb_x_pos
    bomb_rect.top = bomb_y_pos

    if character_rect.colliderect(bomb_rect):
        character = character_gameover
        print("game over")
        running = False

    # 배경 그리기
    screen.blit(background, (0, 0))

    # 캐릭터 그리기
    screen.blit(character, (character_x_pos, character_y_pos))

    # 적 캐릭터 그리기
    screen.blit(bomb, (bomb_x_pos, bomb_y_pos))

    pygame.display.update()


# 게임 종료 전 잠시 대기
pygame.time.delay(2000) # 2초 정도 대기 (ms)

# pygame 종료
pygame.quit()

