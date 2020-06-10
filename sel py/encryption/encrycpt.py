import random

small_letters = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                 "u", "v", "w", "x", "y", "z"]
capital_letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                   'U', 'V', 'W', 'X', 'Y', 'Z']
a=small_letters
b=capital_letters
random.seed(4)
random.shuffle(a)
random.shuffle(b)
print(a)
print(b)
str = "The modern English alphabet is a Latin alphabet consisting of 26 letters, each having an upper- and lower-case form. It originated around the 7th century from the Latin script. Since then, letters have been added or removed to give the current Modern English alphabet of 26 letters (the same as in the ISO basic Latin alphabet). The word alphabet is a compound of first two letters of the Greek alphabet, alpha and beta."
str1 = ""
n = 0
arr = []
for i in str:
    if i.islower():
        arr.append(small_letters[(small_letters.index(i) + n) % 26])
    elif i.isupper():
        arr.append(capital_letters[(capital_letters.index(i) + n) % 26])
    else:
        arr.append(i)
for i in arr:
    str1 = str1 + i
print(str1)
file=open("encryted.txt","w")
file.write(str1)
file.close()

