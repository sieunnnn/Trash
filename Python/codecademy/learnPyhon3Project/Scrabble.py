# In this project, I will process some data from a group of friends playing scrabble.
#  For this, I will use dictionaries to organize players, words, and points.

# Build your Point Dictionary

letters = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]
points = [1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 4, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10]

# make letter_to_points dictionary able to handle lowercase inputs as well.
letters += [letter.lower() for letter in letters]

points *= 2

letter_to_points = {letter:point for letter, point in zip(letters, points)}

letter_to_points[""] = 0


# Score a Word
def score_word(word):
    point_total = 0

    for letter in word:
        point_total += letter_to_points.pop(letter, 0)
    return point_total

brownie_points = score_word("BROWNIE")
# print(brownie_points)

# Score a Game
player_to_words = {"BLUE":"EARTH", "TENNIS":"EYES", "EXIT":"MACHINE", "ERASER":"ZAP", "BELLY":"COMA", "HUSKY":"PERIOD"}

player_to_points = {}

# A function that update total points
def update_point_totals():
    for player, words in player_to_words.items():
        player_points = 0
        for word in words:
            player_points += score_word(word)
        player_to_points[player] = player_points
    print(player_to_points)


# A function that would take in a player and a word, and add that word to the list of words they've played
def play_word(player, words):
    player_to_words[player] = words
    update_point_totals()

