# 선택정렬
# 매번 제일 작은 값을 선택해서 제일 앞에 둔다.

array = [7, 9, 3, 5, 4, 8, 2, 1]

for i in range(len(array)) :
    min_index = i
    for j in range(i + 1, len(array)) :
        if array[min_index] > array[j] :
            min_index = j

    # 스와프
    array[i], array[min_index] = array[min_index], array[i]
