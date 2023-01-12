# 정수 N 이 입력되면 00시 00 분 00초 부터 N 시 59 분 59 초 까지의 모든 시각 중에서
# 3 이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하시오.


# N 을 입력받는다
N = int(input())

count = 0

for hour in range(N + 1):
    for min in range(60):
        for sec in range(60):
            # 매 시각 안에 '3' 이 포함되어 있으면 카운트 증가
            if '3' in str(hour) + str(min) + str(sec):
                count += 1

print(count)