# 테스트 케이스 : T
# 입력 : M, N, K
# K 는 배추의 위치
# 다음 K 줄에는 배추의 위치인 X, Y 가 주어진다.
# 필요한 최소의 배추흰지렁이 마리 수 출력하기


from collections import deque

# 테스트 케이스의 개수 입력받기
T = int(input())

# 이동할 네 방향 정의 (상, 하, 좌, 우)
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y) :
    queue = deque()
    # 방문처리
    queue.append((x, y))

    while queue :
        x, y = queue.popleft()

        # 현재 위치에서 네 방향의 위치 확인
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            # 배추 찾기 공간을 벗어난 경우 무시
            if nx < 0 or ny < 0 or nx >= M or ny >= N:
                continue

            # 해당 배추를 처음 방문하는 경우에만 기록
            if graph[nx][ny] == 1:
                queue.append((nx, ny))
                # 초기화
                graph[nx][ny] = 0


for i in range(T) :
    M, N, K = map(int, input().split())

    # 그래프 만들기
    graph = [[0]*N for _ in range(M)]
    cnt = 0

    # 배추의 위치 입력받기
    for j in range(K) :
        X, Y = map(int, input().split())
        graph[X][Y] = 1

    # 결과 출력
    for row in range(M) :
        for column in range(N) :
            if graph[row][column] == 1 :
                bfs(row, column)
                cnt += 1

    print(cnt)
