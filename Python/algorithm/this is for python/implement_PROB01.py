# 체스판 8 * 8
# 열 : a . . . h
# 행 : 1 . . . 9
# 이동할 수 있는 경우의 수를 출력해야 하며, 체스판 벗어나지 않도록 검사


# 나이트의 위치 입력받기
input_data = input()

# 입력 값에서 행과 열 처리
row = int(input_data[1])
col = int(ord(input_data[0])) - int(ord('a')) + 1

# 이동할 수 있는 경우의 수
steps = [(-2, 1), (-2, -1), (2, 1), (2, -1), (1, -2), (1, 2), (-1, -2), (-1, 2)]

count = 0

for step in steps:
    next_row = row + step[0]
    next_col = col + step[1]

    # 체스판을 벗어나는지 체크
    if next_row >= 1 and next_col >=1 and next_row <= 8 and next_col <= 8 :
        count += 1

print(count)