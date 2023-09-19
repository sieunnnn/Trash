# 화면 크기 설정
import os
import pygame.display

pygame.init()

screen_width = 680
screen_height = 480
screen = pygame.display.set_mode((screen_width, screen_height))

# FPS
clock = pygame.time.Clock()

# 화면 타이틀 설정
pygame.display.set_caption("보글보글보글")

# 캐릭터 만들기
character_default = pygame.image.load("./resource/right.png")
character_left = pygame.image.load("./resource/left.png")
character_attack = pygame.image.load("./resource/attack.png")

character = character_default
character_size = character.get_rect().size
character_width = character_size[0]
character_height = character_size[1]
character_x_pos = (screen_width / 2) - (character_width / 2)
character_y_pos = screen_height - 104

# 캐릭터 이동 방향
character_to_x = 0

# 캐릭터 이동 속도
character_speed = 5

# 무기 만들기
weapon = pygame.image.load("./resource/weapon.png")
weapon_size = weapon.get_rect().size
weapon_width = weapon_size[0]

# 무기는 한 번에 여러 발 발사 가능
weapons = []

# 무기 이동 속도
weapon_speed = 10

# 공 만들기 (4개 크기에 대해 따로 처리)

enemy_right = pygame.image.load("./resource/enemy_right.png")
bubble_2 = pygame.image.load("./resource/bubble2.png")

ball_images = [
    pygame.image.load("./resource/bubble2.png"),
    pygame.image.load("./resource/bubble3.png"),
    pygame.image.load("./resource/bubble4.png")
    ]

# 공 크기에 따른 최초 스피드
ball_speed_y = [-15, -12, -9]

# 공들
balls = []

# 최초 발생하는 큰 공 추가
ball_images[0] = enemy_right

balls.append({
    "pos_x" : 50, # 공의 x 좌표
    "pos_y" : 50, # 공의 y 좌표
    "img_idx" : 0, # 공의 이미지 인덱스
    "to_x" : 3, # 공의 x 축 이동 방향
    "to_y" : -6, # 공의 y 축 이동 방향
    "init_spd_y" : ball_speed_y[0] # y 최초 속도
})

# 사라질 무기, 공 정보 저장 변수
weapon_to_remove = -1
ball_to_remove = -1

# font 정의
game_font = pygame.font.Font("./resource/DePixelBreitFett.ttf", 20)
total_time = 100

# 시작 시간 정의
start_tick = pygame.time.get_ticks()

# 게임 종료 메세지
game_result = "Game Over"


# 배경 만들기
background = pygame.image.load("./resource/background.png")

running = True
while running:
    dt = clock.tick(60)

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                character = character_left
                character_to_x -= character_speed

            elif event.key == pygame.K_RIGHT:
                character = character_default
                character_to_x += character_speed

            # 무기발사
            elif event.key == pygame.K_SPACE:
                character = character_attack
                weapon_x_pos = character_x_pos + (character_width / 2) - (weapon_width / 2)
                weapon_y_pos = screen_height - 165
                weapons.append([weapon_x_pos, weapon_y_pos])

        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                character = character_default
                character_to_x = 0

    # 게임 캐릭터 위치 정의
    character_x_pos += character_to_x

    if character_x_pos < 0 :
        character_x_pos = 0
    elif character_x_pos > screen_width - character_width:
        character_x_pos = screen_width - character_width

    # 무기 위치 조정
    # 무기 위치를 위로 올린다
    weapons = [[w[0], w[1] - weapon_speed] for w in weapons]

    # 천장에 닿은 무기 없애기
    weapons = [[w[0], w[1]] for w in weapons if w[1] > 0 ]

    # 공 위치 정의
    for ball_idx, ball_val in enumerate(balls):

        ball_pos_x = ball_val["pos_x"]
        ball_pos_y = ball_val["pos_y"]
        ball_img_idx = ball_val["img_idx"]
        ball_size = ball_images[ball_img_idx].get_rect().size
        ball_width = ball_size[0]
        ball_height = ball_size[1]

        # 가로벽에 닿았을 때 공 이동 위치 변경 (튕겨 나오는 효과)
        if ball_pos_x < 0 or ball_pos_x > screen_width - ball_width :
            ball_val["to_x"] = ball_val["to_x"] * -1

        # 세로 위치
        # 스테이지에 튕겨서 올라가는 처리
        if ball_pos_y >= screen_height - 104:
            ball_val["to_y"] = ball_val["init_spd_y"]
        else: # 그 외의 모든 경우에는 속도를 증가
            ball_val["to_y"] += 0.5

        ball_val["pos_x"] += ball_val["to_x"]
        ball_val["pos_y"] += ball_val["to_y"]


    # 캐릭터 rect 정보 업데이트
    character_rect = character.get_rect()
    character_rect.left = character_x_pos
    character_rect.top = character_y_pos

    for ball_idx, ball_val in enumerate(balls):
        ball_pos_x = ball_val["pos_x"]
        ball_pos_y = ball_val["pos_y"]
        ball_img_idx = ball_val["img_idx"]

        # 공 rect 정보 업데이트
        ball_rect = ball_images[ball_img_idx].get_rect()
        ball_rect.left = ball_pos_x
        ball_rect.top = ball_pos_y

        # 공과 캐릭터 충돌 처리
        if character_rect.colliderect(ball_rect):
            running = False
            break

        # 공과 무기들 충돌 처리
        for weapon_idx, weapon_val in enumerate(weapons):
            ball_images[0] = bubble_2
            weapon_pos_x = weapon_val[0]
            weapon_pos_y = weapon_val[1]

            # 무기 rect 정보 업데이트
            weapon_rect = weapon.get_rect()
            weapon_rect.left = weapon_pos_x
            weapon_rect.top = weapon_pos_y

            # 충돌 체크
            if weapon_rect.colliderect(ball_rect):
                weapon_to_remove = weapon_idx # 해당 무기 없애기 위한 값 설정
                ball_to_remove = ball_idx # 해당 공 없애기 위한 값 설정

                if ball_img_idx < 2 :
                    # 현재 공 크기 정보를 가지고 온다.
                    ball_width = ball_rect.size[0]
                    ball_height = ball_rect.size[1]

                    # 나눠진 공 정보
                    small_ball_rect = ball_images[ball_img_idx + 1].get_rect()
                    small_ball_width = small_ball_rect[0]
                    small_ball_height = small_ball_rect[1]

                    # 왼쪽으로 튕겨나가는 작은 공
                    balls.append({
                        "pos_x": ball_pos_x + (ball_width / 2) - (small_ball_width / 2),  # 공의 x 좌표
                        "pos_y": ball_pos_y + (ball_height / 2) - (small_ball_height / 2),  # 공의 y 좌표
                        "img_idx": ball_img_idx + 1,  # 공의 이미지 인덱스
                        "to_x": -3,  # 공의 x 축 이동 방향
                        "to_y": -6,  # 공의 y 축 이동 방향
                        "init_spd_y": ball_speed_y[ball_img_idx  + 1]  # y 최초 속도
                    })

                    # 오른쪽으로 튕겨나가는 작은 공
                    balls.append({
                        "pos_x": ball_pos_x + (ball_width / 2) - (small_ball_width / 2),  # 공의 x 좌표
                        "pos_y": ball_pos_y + (ball_height / 2) - (small_ball_height / 2),  # 공의 y 좌표
                        "img_idx": ball_img_idx + 1,  # 공의 이미지 인덱스
                        "to_x": 3,  # 공의 x 축 이동 방향
                        "to_y": -6,  # 공의 y 축 이동 방향
                        "init_spd_y": ball_speed_y[ball_img_idx  + 1]  # y 최초 속도
                    })

                break

        else :
            continue
        break


    # 충돌된 공 or 무기 없애기
    if ball_to_remove > -1:
        del balls[ball_to_remove]
        ball_to_remove = -1

    if weapon_to_remove > -1:
        del weapons[weapon_to_remove]
        weapon_to_remove = -1

    # 모든 공을 없앤 경우 게임 종료 (성공)
    if len(balls) == 0:
        game_result = "Mission Complete"
        running = False

    screen.blit(background, (0, 0))

    for weapon_x_pos, weapon_y_pos in weapons:
        screen.blit(weapon, (weapon_x_pos, weapon_y_pos))

    for idx, val in enumerate(balls):
        ball_pos_x = val["pos_x"]
        ball_pos_y = val["pos_y"]
        ball_img_idx = val["img_idx"]
        screen.blit(ball_images[ball_img_idx], (ball_pos_x, ball_pos_y))

    screen.blit(character, (character_x_pos, character_y_pos))

    # 경과 시간 계산
    elapsed_time = (pygame.time.get_ticks() - start_tick) / 1000
    timer = game_font.render("{}".format(int(total_time - elapsed_time)), True, (255, 255, 255))
    screen.blit(timer, (40, 40))

    # 시간 초과했다면
    if total_time - elapsed_time <= 0:
        game_result = "Time Over"
        running = False

    pygame.display.update()

# 게임 오버 메시지
msg = game_font.render(game_result, True, (255, 255, 255))
msg_rect = msg.get_rect(center = (int(screen_width / 2), int(screen_height / 2)))
screen.blit(msg, msg_rect)
pygame.display.update()

# 2 초 대기
pygame.time.delay(6000)

pygame.quit()