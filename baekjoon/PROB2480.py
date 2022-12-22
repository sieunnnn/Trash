# 같은 눈이 3 개가 나오면 10000 + (같은 눈) * 1000 원의 상금을 받게 된다.
# 같은 눈이 2 개가 나오면 1000 + (같은 눈) * 100 원의 상금을 받게 된다.
# 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈) * 100 원의 상금을 받게 된다.

A, B, C = map(int, input().split())

money = 0
result = 0

if (A == B and B == C) :
    money = 10000 + A * 1000
elif (A == B and B != C) :
    money = 1000 + A * 100
elif (A != B and B !=C) :
    result = max(A, B, C)
    money = max * 100

print(money)