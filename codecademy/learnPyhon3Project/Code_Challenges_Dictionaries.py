# Code Challenges: Dictionaries

# Sum Values
def sum_values(my_dictionary):
    sum = 0
    for value in my_dictionary.values():
        sum += value
    return sum

# test function
# print(sum_values({"milk":5, "eggs":2, "flour": 3}))
# print(sum_values({10:1, 100:2, 1000:3}))


# Even Keys
def sum_even_keys(my_dictionary):
    sum = 0
    for key in my_dictionary.keys():
        if key % 2 == 0:
            sum += my_dictionary[key]
    return sum

# test function
#print(sum_even_keys({1:5, 2:2, 3:3}))
#print(sum_even_keys({10:1, 100:2, 1000:3}))


# Add Ten
def add_ten(my_dictionary):
    for key in my_dictionary.keys():
        my_dictionary[key] += 10
    return my_dictionary

# test function
# print(add_ten({1:5, 2:2, 3:3}))
# print(add_ten({10:1, 100:2, 1000:3}))


# Values That Are Keys
def values_that_are_keys(my_dictionary):
    value_keys = []
    for value in my_dictionary.values():
        # value 와 같은 값을 가진 key 를 찾는 구문
        if value in my_dictionary:
            value_keys.append(value)
    return value_keys

# print(values_that_are_keys({1:100, 2:1, 3:4, 4:10}))
# print(values_that_are_keys({"a":"apple", "b":"a", "c":100}))


# Largest Value
def max_key(my_dictionary):
    # using float("-inf") in order to initialize them to the lowest possible value.
    largest_key = float("-inf")
    largest_value = float("-inf")

    for key, value in my_dictionary.items():
        if value > largest_value:
            largest_value = value
            largest_key = key
    return largest_key

# test function
# print(max_key({1:100, 2:1, 3:4, 4:10}))
# print(max_key({"a":100, "b":10, "c":1000}))
