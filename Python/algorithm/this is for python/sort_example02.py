# 삽입 정렬

array = [1, 3, 5, 6, 2, 9, 7]

for i in range(1, len(array)) :
    # 인덱스 i 부터 1 까지 감소하며 반복하는 문법 (정렬되니까 수가 줄을 것임)
    for j in range(i, 0, -1) :
        # 한 칸씩 왼쪽으로 이동
        if array[j] < array[j -1] :
            array[j], array[j -1] = array[j -1], array[j]

        else :
            break

print(array)
