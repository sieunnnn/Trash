# Code Challenges : Lists

# Append Size
def append_size(lst):
  lst.append(len(lst))
  return lst

# test function
# print(append_size([23, 42, 108]))


# Append Sum
def append_sum(lst):
    lst.append(lst[-1] + lst[-2])
    lst.append(lst[-1] + lst[-2])
    lst.append(lst[-1] + lst[-2])
    return lst

# test function
# print(append_sum([1, 1, 2]))


# Larger List
def larger_list(lst1, lst2):
    if len(lst1) >= len(lst2):
        return lst1[-1]
    else:
        return lst2[-1]

# test function
# print(larger_list([4, 10, 2, 5], [-10, 2, 5, 10]))


# More than N
def more_than_n(lst, item, n):
    if lst.count(item) > n:
        return True
    else:
        return False

# test function
# print(more_than_n([2, 4, 6, 2, 3, 2, 1, 2], 2, 3))


# Combine Sort
def combine_sort(lst1, lst2):
    return sorted(lst1 + lst2)

# test function
# print(combine_sort([4, 10, 2, 5], [-10, 2, 5, 10]))
