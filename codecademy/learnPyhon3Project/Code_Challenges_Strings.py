# Code Challenges: Strings

# Count Letters

letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

def unique_english_letters(word):
    uniques = 0
    for letter in letters:
        if letter in word:
            uniques += 1
    return uniques

# test function
# print(unique_english_letters("mississippi"))
# print(unique_english_letters("Apple"))


# Count X
def count_char_x(word, x):
    count = 0
    for letter in word:
        if letter == x:
            count += 1
    return count

# test function
# print(count_char_x("mississippi", "s"))
# print(count_char_x("mississippi", "m"))


# Count Multi X
def count_multi_char_x(word, x):
    splits = word.split(x)
    return (len(splits) - 1)

# test function
# print(count_multi_char_x("mississippi", "iss"))
# print(count_multi_char_x("apple", "pp"))


# Substring Between
def substring_between_letters(word, start, end):
    start_index = word.find(start)
    end_index = word.find(end)
    if start_index > -1 and end_index > -1:
        # start index 포함하면 안된다는 거 주의하기
        return(word[start_index + 1:end_index])
    # 만약 조건 해당하지 않으면 원래 단어 반환
    return word

# test function
# print(substring_between_letters("apple", "p", "e"))
# print(substring_between_letters("apple", "p", "c"))


# X Length
def x_length_words(sentence, x):
    words = sentence.split(" ")
    for word in words:
        if len(word) < x:
            return False
    return True

# test function
# print(x_length_words("i like apples", 2))
# print(x_length_words("he likes apples", 2))
