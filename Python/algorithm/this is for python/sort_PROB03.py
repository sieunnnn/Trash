# 두 배열의 원소를 최대 K 번 교체하여 배열 A 의 모든 원소의 합이 최대가 되도록 한다.


# N 과 K 입력받기
N, K = map(int, input().split())

# 배열 A 의 원소 입력받기
A = list(map(int, input().split()))
# 배열 B 의 원소 입력받기
B = list(map(int, input().split()))

A.sort()
B.sort(reverse=True)

for i in range(K) :
    if A[i] < B[i] :
        A[i], B[i] = B[i], A[i]

    else :
        break

print(sum(A))