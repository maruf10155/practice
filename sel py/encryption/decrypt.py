import random

small_letters = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                 "u", "v", "w", "x", "y", "z"]
capital_letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                   'U', 'V', 'W', 'X', 'Y', 'Z']
a = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
     "u", "v", "w", "x", "y", "z"]
b = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
     'U', 'V', 'W', 'X', 'Y', 'Z']
random.seed(55)
random.shuffle(a)
random.shuffle(b)
file = open("encryted.txt", "r")
str0 = file.read()
file.close()
str1 = ""
n = 0
arr = []
for i in str0:
    if i.islower():
        arr.append(small_letters[a.index(i)])
    elif i.isupper():
        arr.append(capital_letters[b.index(i)])
    elif i.isdigit():
        arr.append(str(9-int(i)))
    else:
        arr.append(i)
for i in arr:
    str1 = str1 + i
print(str1)
