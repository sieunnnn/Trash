#  손님에게 거슬러 줘야 할 돈이 1260 원 일 때 거슬러 줘야 할 동전의 최소 개수를 구하여라.

# 거스름돈
n = 1260

# 동전의 개수
count = 0

coin_types = [500, 100, 50, 10]

for coin in coin_types:
    count += n // coin
    n %= coin

print(count)