# Code Challenges : Functions

# Tenth Power
def tenth_power(num):
    return num ** 10

# test function
# print(tenth_power(1))
# print(tenth_power(0))
# print(tenth_power(2))


# Square Root
def square_root(num):
    return num ** 0.5

# print(square_root(16))
# print(square_root(100))


# Win Percentage
def win_percentage(wins, losses):
    total_games = wins + losses
    ratio_win = wins / total_games
    return ratio_win * 100

# test function
# print(win_percentage(5, 5))
# print(win_percentage(10, 0))


# Average
def average(num1, num2):
    sum = num1 + num2
    return sum / 2

# test function
# print(average(1, 100))
# print(average(1, -1))


# Remainder
def remainder(num1, num2):
    return (num1 * 2) % (num2 / 2)


print(remainder(15, 14))
print(remainder(9, 6))
