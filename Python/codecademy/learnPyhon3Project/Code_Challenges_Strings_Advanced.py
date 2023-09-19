# Code Challenges: Strings (Advanced)

# Check Name
# 각각의 케이스 를 만들 필요 없이 하나만 골라서 만들어 도 된다.
def check_for_name(sentence, name):
    return name.lower() in sentence.lower()

# test function
# print(check_for_name("My name is Jamie", "Jamie"))
# print(check_for_name("My name is jamie", "Jamie"))
# print(check_for_name("My name is JAMIE", "Jamie"))


# Every Other Letter
# 홀수번째 문자만 추출
def every_other_letter(word):
    every_other = ""
    for i in range(0, len(word), 2):
        every_other += word[i]
    return every_other

# test function
# print(every_other_letter("Codecademy"))
# print(every_other_letter("Hello world!"))
# print(every_other_letter(""))


# Reverse
def reverse_string(word):
    reverse = ""
    for i in range(len(word)-1, -1, -1):
        reverse += word[i]
    return reverse

# test function
# print(reverse_string("Codecademy"))
# print(reverse_string("Hello world!"))
# print(reverse_string(""))


# Make Spoonerism
def make_spoonerism(word1, word2):
    return word2[0] + word1[1:] + " " + word1[0] + word2[1:]

# test function
# print(make_spoonerism("Codecademy", "Learn"))
# print(make_spoonerism("Hello", "world!"))
# print(make_spoonerism("a", "b"))


# Add Exclamation
def add_exclamation(word):
    while(len(word) < 20):
        word += "!"
    return word

# test function
# print(add_exclamation("Codecademy"))
# print(add_exclamation("Codecademy is the best place to learn"))
