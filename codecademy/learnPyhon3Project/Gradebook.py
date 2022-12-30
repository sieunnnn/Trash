# This is a program for organize subjects and grades.

# subjects
sybjects = ["physics","calculus", "poetry", "history"]

# grades
grades = [98, 97, 85, 88]

# gradebook
gradebook = [["physics", 98], ["calculus", 97], ["poety", 85], ["history", 88]]
print(gradebook)

# append()
gradebook.append(["computer science", 100])
gradebook.append(["visual arts", 93])

# chagne values
gradebook[-1][-1] = 98

# remove values
gradebook[2].remove(85)

# append()
gradebook[2].append("Pass")

# full gradebook
last_semester_gradebook = [["korean", 98], ["english", 97], ["chemistry", 85], ["math", 88]]
full_gradebook = last_semester_gradebook + gradebook
print(full_gradebook)