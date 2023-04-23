# 수빈이의 위치가 X 일 때 걷는다면 1 초 후에 X -1 또는 X + 1 로 이동하게 된다.
# 순간이동을 하는 경우에는 1 초 후에 2*X 의 위치로 이동하게 된다.


from collections import deque


# N 과 K 를 입력받는다.
N, K = map(int, input().split())

# 큐 구현
queue = deque()

# 방문 리스트
visited = [0 for i in range(1000001)]

# bfs 함수
def bfs(start) :
    # 시작지점
    queue.append(start)
    visited[start] = 1

    while queue :
        # 현재 위치
        curr = queue.popleft()

        # 동생과 수빈이가 같은 위치에 있으므로 가장 빠른 시간이 0 초이다.
        if curr == K :
            # 처음에 1초로 잡았으므로 -1 을 해줘야 한다.
            return visited[curr] - 1

        for i in (curr -1, curr + 1, curr * 2) :
            # 점의 범위 (0 <= i <= 100000) 에 속하고 방문한 이력이 없어야 한다.
            if 0 <= i <= 100000 and not visited[i] :
                # 방문처리
                visited[i] = visited[curr] + 1
                queue.append(i)

print(bfs(N))


