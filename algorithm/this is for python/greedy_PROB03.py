# 어떠한 수 N 이 1 이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행한다.
# 1. N 에서 1 을 뺀다
# 2. N 을 K 로 나눈다. (N 이 K 로 나누어 떨어질 때만 선택 가능)
# 1 이 될 때 까지의 최소 수행 횟수를 구하시오.

# N 과 K 를 공백을 구분하여 입력 받는다.
N, K = map(int, input().split())
count = 0

# N 이 K 이상 이라면 K 로 계속 나누기
while True :
    # N 이 K 로 나누어 떨어지는 수가 될 때 까지 첫번 째 과정을 몇번 하는가
    number = (N // K) * K
    count += (N - number)
    N = number

    # N 이 K 보다 작을 때 반복문 탈출
    if N < K :
         break

    # K 로 나누기
    N //= K
    count += 1

# 남은 수에 대하여 1 씩 빼기
count += (N -1)
print(count)