# 피보나치수를 재귀함수로 짜보자


# 피보나치 함수
def fibo(N):

    if N <= 1:
        return N

    return fibo(N-2) + fibo(N-1)

N = int(input())

print(fibo(N))