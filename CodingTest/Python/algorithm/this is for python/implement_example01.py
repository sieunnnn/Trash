# 가장 왼쪽 위 좌표 (1,1)
# L : 왼쪽으로 한 칸 이동
# R : 오른쪽으로 한 칸 이동
# U : 위로 한 칸 이동
# D : 아래로 한 칸 이동
# 이 때 N * N 크기의 정사각형 공간을 벗어나는 움직임은 무시된다.
# 여행가가 최종적으로 도착할 지점의 좌표를 출력하는 프로그램을 작성하시오.


# N 입력받기
N = int(input())

# X 와 Y 의 좌표
X, Y  = 1, 1

# 이동 계획을 공백을 기준으로 입력받는다.
movements = input().split()

# L R U D 의 row 방향 이동
dX = [0, 0, -1, 1]
dY = [-1, 1, 0, 0]
movement_type =['L', 'R', 'U', 'D']

# 이동 계획 확인
for movement in movements:
    for i in range(len(movement_type)):
        if movement == movement_type[i]:
             nX = X + dX[i]
             nY = Y + dY[i]

    # 공간을 벗어나는 경우 무시
    if nX < 1 or nY < 1 or nX > N or nY > N :
        continue

    # 이동 수행
    X, Y = nX, nY

print(X,Y)