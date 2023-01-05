import pygame

# 초기화 (반드시 필요)
pygame.init()

# 화면 크기 설정
screen_width = 480 # 가로 크기
screen_heignt = 640 # 세로 크기
screen = pygame.display.set_mode((screen_width, screen_heignt))

# 화면 타이틀 설정
pygame.display.set_caption("Nado Game") # 게임 이름

# 이벤트 루프
running = True # 게임이 진행중인가? 를 확인
while running:
    # 어떤 이벤트가 발생 하였는가?
    for event in pygame.event.get():
        # 창이 닫히는 이벤트가 발생 하였는가?
        if event.type == pygame.QUIT:
            # 게임이 진행 중이 아니다.
            running = False
# pygame 종료
pygame.quit()