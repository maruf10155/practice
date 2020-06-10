import random

small_letters = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                 "u", "v", "w", "x", "y", "z"]
capital_letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                   'U', 'V', 'W', 'X', 'Y', 'Z']
random.seed(4)
random.shuffle(small_letters)
random.shuffle(capital_letters)
file = open("encryted.txt", "r")
str = file.read()
file.close()
str1 = ""
n = 0
arr = []
for i in str:
    if i.islower():
        arr.append(small_letters[(small_letters.index(i) - n) % 26])
    elif i.isupper():
        arr.append(capital_letters[(capital_letters.index(i) - n) % 26])
    else:
        arr.append(i)
for i in arr:
    str1 = str1 + i
print(str1)
