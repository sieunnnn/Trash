# Code Challenges: Dictionaries (Advanced)

# Word Length Dict
def word_length_dictionary(words):
    words_lengths = {}
    for word in words:
        words_lengths[word] = len(word)
    return words_lengths

# test function
# print(word_length_dictionary(["apple", "dog", "cat"]))
# print(word_length_dictionary(["a", ""]))


# Frequency Count
def frequency_dictionary(words):
    freqs = {}

    for word in words:
        if word not in freqs:
            freqs[word] = 0
        freqs[word] += 1
    return freqs

# print(frequency_dictionary(["apple", "apple", "cat", 1]))
# print(frequency_dictionary([0,0,0,0,0]))


# Unique Values
def unique_values(my_dictionary):
    seen_values = []
    for value in my_dictionary.values():
        if value not in seen_values:
            seen_values.append(value)
    return len(seen_values)

# test function
# print(unique_values({0:3, 1:1, 4:1, 5:3}))
# print(unique_values({0:3, 1:3, 4:3, 5:3}))


# Count First Letter
def count_first_letter(names):
    letters = {}
    for key in names:
        first_letter = key[0]
        if first_letter not in letters:
            letters[first_letter] = 0
        letters[first_letter] += len(names[key])
    return letters

# test function
# print(count_first_letter({"Stark": ["Ned", "Robb", "Sansa"], "Snow" : ["Jon"], "Lannister": ["Jaime", "Cersei", "Tywin"]}))
# print(count_first_letter({"Stark": ["Ned", "Robb", "Sansa"], "Snow" : ["Jon"], "Sannister": ["Jaime", "Cersei", "Tywin"]}))
