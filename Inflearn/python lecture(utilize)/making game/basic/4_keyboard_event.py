import pygame

# 초기화 (반드시 필요)
pygame.init()

# 화면 크기 설정
screen_width = 480 # 가로 크기
screen_height = 640 # 세로 크기
screen = pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀 설정
pygame.display.set_caption("Nado Game") # 게임 이름

# 배경 이미지 불러오기
background = pygame.image.load("/python lecture(utilize)/making game/resource/ex resource/background.png")

# 스프라이트(캐릭터) 불러오기
character = pygame.image.load("/python lecture(utilize)/making game/resource/ex resource/character.png")

# 캐릭터의 크기
character_size = character.get_rect().size # 이미지의 크기를 구해온다.
character_width = character_size[0] # 캐릭터의 가로크기
character_height = character_size[1] # 캐릭터의 세로크기

# 캐릭터의 위치
character_x_pos = (screen_width / 2) - (character_width / 2) # 화면 가로 절반 크기에 해당 하는 곳에 위치
character_y_pos = screen_height - character_height # 화면 세로  가장 아래에 위치

# 이동할 좌표
to_x = 0
to_y = 0

# 이벤트 루프
running = True # 게임이 진행중인가? 를 확인
while running:
    # 어떤 이벤트가 발생 하였는가?
    for event in pygame.event.get():
        # 창이 닫히는 이벤트가 발생 하였는가?
        if event.type == pygame.QUIT:
            # 게임이 진행 중이 아니다.
            running = False

        if event.type == pygame.KEYDOWN: # 키가 눌러졌는지 확인
            if event.key == pygame.K_LEFT: # 캐릭터를 왼쪽으로
                to_x -= 0.25
            elif event.key == pygame.K_RIGHT: # 캐릭터를 오른쪽으로
                to_x += 0.25
            elif event.key == pygame.K_UP: # 캐릭터를 위로
                to_y -= 0.25
            elif event.key == pygame.K_DOWN: # 캐릭터를 아래로
                to_y += 0.25

        if event.type == pygame.KEYUP: # 방향키를 떼면 멈춘다.
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                to_x = 0
            elif event.key == pygame.K_UP or event.key == pygame.K_DOWN:
                to_y = 0

    # 캐릭터 이동
    character_x_pos += to_x
    character_y_pos += to_y

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

    # 배경 그리기
    screen.blit(background, (0, 0))

    # 배경 색으로 채우기
    # screen.fill((0, 0, 255))

    # 캐릭터 그리기
    screen.blit(character, (character_x_pos, character_y_pos))

    # 게임 화면을 다시 그리기!
    pygame.display.update()

# pygame 종료
pygame.quit()