# Code Challenges : Loops

# Divisible By Ten
def divisible_by_ten(nums):
    count = 0
    for num in nums:
        if num % 10 == 0:
            count += 1
    return count

# test function
# print(divisible_by_ten([20, 25, 30, 35, 40]))


# Greetings
def add_greetings(names):
    new_list = []
    for name in names:
        new_list.append("Hello, " + name)
    return new_list

# test function
# print(add_greetings(["Owen", "Max", "Sophie"]))


# Delete Starting Even Numbers
def delete_starting_evens(lst):
    while (len(lst) > 0 and lst[0] % 2 == 0):
        lst = lst[1:]
    return lst

# test function
# print(delete_starting_evens([4, 8, 10, 11, 12, 15]))
# print(delete_starting_evens([4, 8, 10]))


# Odd Indices
def odd_indices(lst):
    new_lst = []
    for index in range(1, len(lst), 2):
        new_lst.append(lst[index])
    return new_lst

# test function
print(odd_indices([4, 3, 7, 10, 11, -2]))


# Exponents
def exponents(bases, powers):
    new_lst = []
    for base in bases:
        for power in powers:
            new_lst.append(base ** power)
    return new_lst

# test function
print(exponents([2, 3, 4], [1, 2, 3]))