# 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M 번 더하여 가장 큰 수를 만든다.
# 단, 배열의 특정한 인덱스에 해당하는 수가 연속해서 K 번을 초과하여 더해질 수 없다.
# 서로 다른 인덱스에 해당하는 수가 같은 경우에도 서로 다른 것으로 간주한다.

# 입력 받기
N, M, K = map(int, input().split())

# N 개의 수를 공백으로 구분하여 입력받기
numbers = list(map(int, input().split()))

# 입력 받은 수 정렬하기
numbers.sort()

max = numbers[-1] # 가장 큰 수
second_max = numbers[-2] # 두번째로 가장 큰 수

# 가장 큰 수는 몇번 더해지는가?
count_max = M // (K + 1) * K + M % (K +1)

result = 0

# 가장 큰 수 * 더해지는 횟수
result += max * count_max

# 두번째로 큰수 * 더해지는 횟수
result += second_max * (M - count_max)

print(result)