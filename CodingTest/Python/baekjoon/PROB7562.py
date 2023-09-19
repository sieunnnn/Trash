# 나이트는 몇 번 움직이면 이 칸으로 이동할 수 있을까?
# 입력 : 첫째 줄 - 테스트 케이스 , 둘째 줄 - 나이트가 현재 있는 칸
# 셋째 줄 - 나이트가 이동하려고 하는 칸
# 출력 : 나이트가 최소 몇 번만에 이동할 수 있을까?


from collections import deque


# bfs 구현
def bfs(x, y) :
    # 이동할 여덟 방향 정의
    dx = [-2, -2, -1, -1, 1, 1, 2, 2]
    dy = [-1, 1, -2, 2, -2, 2, -1, 1]

    # 큐 구현
    queue = deque()
    queue.append((x, y))

    # 큐가 빌 때까지 반복
    while queue :
        x, y = queue.popleft()

        # 도착위치에 다다르면 결과를 반환한다.
        if x == toward_x and y == toward_y :
            return graph[x][y]

        # 현재 위치에서 여덟 방향의 위치 확인
        for i in range(8) :
            nx = x + dx[i]
            ny = y + dy[i]

            # 해당 값이 그래프 안에 있어야 하며, 이동할 떄마다 값을 1 증가 시켜준다.
            if 0 <= nx < graph_size and 0 <= ny < graph_size and graph[nx][ny] == 0 :
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))


# 테스트 케이스 입력받기
T = int(input())

for i in range(T) :
    # 체스판의 크기 입력받기
    graph_size = int(input())
    # 현재 있는 칸 입력받기
    curr_x, curr_y = map(int, input().split())
    # 이동하려고 하는 칸 입력받기
    toward_x, toward_y = map(int, input().split())
    # 맵정보
    graph = [[0] * graph_size for i in range(graph_size)]

    # 결과 출력
    print(bfs(curr_x, curr_y))