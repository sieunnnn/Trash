# 캐릭터가 있는 장소는 1 x 1  크기의 정사각형으로 이루어진 N * M 크기의 직사각형
# 각각의 칸은 육지 또는 바다이다.
# A 는 북쪽으로부터 떨어진 칸의 개수, B 는 서쪽으로부터 떨어진 칸의 개수이다.
# 캐릭터는 상하좌우로 움직일 수 있고, 바다로 되어 있는 공간에는 갈 수 없다.
# 1. 현재 위치에서 현재 방향을 기준으로 왼쪽 방향부터 차례대로 갈 곳을 정한다.
# 2. 캐릭터의 바로 왼쪽 방향에서 아직 가보지 않은 칸이 존재한다면, 왼쪽 방향으로 회전한 다음
#       왼쪽으로 한 칸을 전진한다. 왼쪽 방향에 가보지 않은 칸이 없다면, 왼쪽 방향으로
#       회전만 한 다음 1 단계로 돌아 간다.
# 3. 만약 네 방향 모두 이미 가본 칸이거나 바다로 되어 있는 칸인 경우에는, 바라보는
#       방향을 유지한 채로 한 칸 뒤로 가고 1 단계로 돌아간다. 단, 이때 뒤쪽 방향이
#       바다인 칸이라 뒤로 갈 수 없는 경우에는 움직임을 멈춘다.
# 캐릭터가 방문한 칸의 수를 출력하는 프로그램을 만드시오.


# M * N (가로 * 세로)
M, N = map(int, input().split())

# 행, 열, 방향 (0 북 1 동 2 남 3 서)
row, col, direction = map(int, input().split())

# 북 동 남 서 정의
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

# 전체 맵 정보 입력 받기
map = []
for i in range(N):
    map.append(list(map(int, input().split())))

# 방문한 위치를 저장하기 위한 행렬 생성 후 0 으로 초기화
check_visited = [[0]*M for i in range(N)]

# 위에서 입력 받은 캐릭터의 위치를 방문 처리
check_visited[row][col] = 1

# 왼쪽으로 회전
def turn_left() :
    # direction 이 전역 변수 이기 때문에 global 키워드 사용
    global direction
    direction -= 1

    # 북에서 서로 넘어가는 경우
    if direction == -1 :
        direction = 3


# 시뮬레이션 시작
count = 1
turn_time = 0

while True :
    turn_left()

    new_row = row + dx[direction]
    new_col = col + dy[direction]

    # 회전 한 이후 정면에 가보지 않은 칸이 존재한다면 이동
    if check_visited[new_row][new_col] == 0 and map[new_row][new_col] == 0:
        check_visited[new_row][new_col] == 1
        row = new_row
        col = new_col

        count += 1
        turn_time = 0

        continue

    # 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
    else :
        turn_time += 1

    # 네 방향 모두 갈 수 없는 경우
    if turn_time == 4:
        new_row = row - check_visited[direction]
        new_col = col - check_visited[direction]

        # 뒤로 갈 수 있다면 이동하기
        if map[new_row][new_col] == 0:
            row = new_row
            col = new_col

        # 뒤가 바다로 막혀있는 경우
        else :
            break

        turn_time = 0

print(count)