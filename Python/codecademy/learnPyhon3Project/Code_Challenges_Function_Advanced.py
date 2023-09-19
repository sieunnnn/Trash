# Code Challenges : Functions(Advanced)

# First Three Multiples
def first_three_multiples(num):
    print(num*1)
    print(num*2)
    print(num*3)
    return num*3

# test function
# first_three_multiples(10)
# first_three_multiples(0)


# Tip
def tip(total, percentage):
    tip = total * percentage / 100
    return tip

# test function
# print(tip(10, 25))
# print(tip(0, 100))


# Bond, James Bond
def introduction(first_name, last_name):
    return print(last_name  + ", " + first_name + " " + last_name)


# Dog Years
def dog_years(name, age):
    return print(name + ", you are " + str(age * 7) + " years old in dog years")

print(dog_years("Lola", 16))
print(dog_years("Baby", 0))


# All Operations
def lots_of_math(a, b, c, d):
    first_result = a + b
    second_result = c -d
    third_result = first_result * second_result
    fourth_result = third_result % a
    print(first_result)
    print(second_result)
    print(third_result)
    return fourth_result

# print(lots_of_math(1, 2, 3, 4))
# print(lots_of_math(1, 1, 1, 1))
