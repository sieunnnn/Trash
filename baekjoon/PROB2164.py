# N 장의 카드가 있다. 각각의 카드는 차례로 1 부터 N 까지의 번호가 붙어있으며,
# 1 번 카드가 제일 위에, N 번 카드가 제일 아래인 상태로 순서대로 카드가 놓여있다.
# 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는
# 카드 밑으로 옮긴다.
# N 이 주어졌을 때, 마지막에 남게 되는 카드를 구하는 프로그램을 작성하시오.


from collections import deque


# N 입력받기
N = int(input())

# queue 구현하기
queue = deque([i for i in range(1, N + 1)])

while len(queue) >1 :
    queue.popleft()
    temp = queue.popleft()
    queue.append(temp)

print(queue[0])