import pygame

# 초기화 (반드시 필요)
pygame.init()

# 화면 크기 설정
screen_width = 480 # 가로 크기
screen_heignt = 640 # 세로 크기
screen = pygame.display.set_mode((screen_width, screen_heignt))


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
character_y_pos = screen_heignt - character_height # 화면 세로  가장 아래에 위치

# 이벤트 루프
running = True # 게임이 진행중인가? 를 확인
while running:
    # 어떤 이벤트가 발생 하였는가?
    for event in pygame.event.get():
        # 창이 닫히는 이벤트가 발생 하였는가?
        if event.type == pygame.QUIT:
            # 게임이 진행 중이 아니다.
            running = False

    # 배경 그리기
    screen.blit(background, (0,0))
    # 배경 색으로 채우기
    #screen.fill((0, 0, 255))

    # 캐릭터 그리기
    screen.blit(character, (character_x_pos, character_y_pos))
    # 게임 화면을 다시 그리기!
    pygame.display.update()


# pygame 종료
pygame.quit()