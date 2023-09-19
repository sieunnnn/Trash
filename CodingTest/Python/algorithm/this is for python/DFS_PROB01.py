# N * M  크기의 얼음 틀이 있다. 구멍이 뚫려 있는 부분은 0, 칸막이가 존재하는 부분은
# 1 로 표시된다. 구멍이 뚫려있는 부분끼리 상, 하, 좌, 우로 붙어 있는 경우 서로 연결되어
# 있는 것으로 간주한다. 이때 얼음 틀의 모양이 주어졌을 때 생성되는 총 아이스크림의
# 개수를 구하는 프로그램을 작성하시오.


# N 과 M 입력받기
N, M = map(int, input().split())

# 얼음틀의 형태 입력받기
graph = []
for i in range(N) :
    graph.append(list(map(int, input())))

# DFS 로 특정한 노드를 방문한 뒤에 연결된 모든 노드들 도 방문
def dfs(x, y) :
    # 주어진 범위를 벗어나는 경우에는 즉시 종료 한다.
    if x <= -1 or x >= N or y <= -1 or y >= M :
        return False
    # 현재 노드를 아직 방문하지 않았다면
    if graph[x][y] == 0 :
        # 해당 노드를 방문처리 한다.
        graph[x][y] = 1
        # 상, 하, 좌, 우 모두 재귀적으로 호출한다.
        dfs(x - 1, y)
        dfs(x + 1, y)
        dfs(x , y  - 1)
        dfs(x , y  + 1)
        return True

    return False

# 모든 노드에 대하여 음료수 채우기
result = 0
for i in range(N) :
    for j in range(M) :
        # 현재 위치에서 DFS 수행
        if dfs(i, j) == True :
            result += 1
print(result)