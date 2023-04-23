# 수열을 내림차순으로 정렬하는 프로그램을 만드시오


# N 입력받기
N = int(input())

# 수열을 담을 배열
array = []

# 수열 생성
for i in range(N) :
    array.append(int(input()))

# 수열 내림차순 정렬
print(sorted(array, reverse=True), sep=' ')