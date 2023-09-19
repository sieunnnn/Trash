# 입력 : N, M(2 ≤ N, M ≤ 100)이 주어진다. 다음 N개의 줄에는 M개의 정수로 미로가 주어진다.
# 각각의 수들은 붙어서 입력으로 주어진다.
# 첫째 줄에 지나야 하는 최소의 칸 수를 출력한다.
# 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.
# 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.


import sys
from collections import deque


# N 과 M 입력받기
N, M = map(int, input().split())

# 그래프 생성하기
graph = []
for i in range(N) :
    graph.append(list(map(int, sys.stdin.readline().rstrip())))

# 이동할 네 방향 정의 (상, 하, 좌, 우)
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# BFS 소스코드 구현
def bfs(x, y) :
    # 큐(queue) 구현을 위해 deque 라이브러리 사용
    queue = deque()
    queue.append((x, y))

    # 큐가 빌 때까지 반복
    while queue :
        x, y = queue.popleft()
        # 현재 위치에서 네 방향의 위치 확인
        for i in range(4) :
            nx = x + dx[i]
            ny = y + dy[i]

            # 미로 찾기 공간을 벗어난 경우 무시
            if nx < 0 or ny < 0 or nx >= N or ny >= M :
                continue

            # 벽인 경우 무시
            if graph[nx][ny] == 0 :
                continue

            # 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
            if graph[nx][ny] == 1 :
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))

    # 가장 오른쪽 아래까지의 최단 거리 반환
    return graph[N -1][M -1]

# BFS 수행한 결과 출력
print(bfs(0, 0))