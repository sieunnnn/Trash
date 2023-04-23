# 성적이 낮은 순서로 학생 출력하기


# 학생의 수 N 입력
N = int(input())

# 학생 정보를 받을 배열
students = []

# 학생 정보 입력받기
for i in range(N) :
    student_data = input().split()
    students.append((student_data[0], int(student_data[1])))

students = sorted(students, key=lambda student : student[1])

for student in students :
    print(student[0], end=' ')