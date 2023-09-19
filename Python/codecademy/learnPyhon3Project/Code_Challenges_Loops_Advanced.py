# Code Challenges : Lioops(Advanced)

# Larger Sum
def larger_sum(lst1, lst2):
    sum_lst1 = 0
    sum_lst2 = 0

    for num in lst1:
        sum_lst1 += num
    for num in lst2:
        sum_lst2 += num

    if sum_lst1 >= sum_lst2:
        return lst1
    return lst2

# test function
print(larger_sum([1, 9, 5], [2, 3, 7]))


# Over 9000
def over_nine_thousand(lst):
    sum = 0
    for num in lst:
        sum += num
        if sum > 9000:
            break
    return sum

# test function
# print(over_nine_thousand([8000, 900, 120, 5000]))


# Max Num
def max_num(nums):
    max = nums[0]
    for num in nums:
        if num > max:
            max = num
    return max

# test function
# print(max_num([50, -10, 0, 75, 20]))


# Same Values
def same_values(lst1, lst2):
    new_lst = []
    for index in range(len(lst1)):
        if lst1[index] == lst2[index]:
            new_lst.append(index)
    return new_lst

# test function
# print(same_values([5, 1, -10, 3, 3], [5, 10, -10, 3, 5]))


# Reversed List
def reversed_list(lst1, lst2):
    for index in range(len(lst1)):
        if lst1[index] != lst2[len(lst2) - 1 - index]:
            return False
    return True

# test function
# print(reversed_list([1, 2, 3], [3, 2, 1]))
# print(reversed_list([1, 5, 3], [3, 2, 1]))
