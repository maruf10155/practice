import random

char = []
char1 = []
for i in range(32, 127):
    char.append(chr(i))
    char1.append(chr(i))
random.seed(120)
random.shuffle(char1)
str0 = "maruf Amin 756"
str1 = ""
arr = []
for i in str0:
    if i not in char:
        arr.append(i)
    else:
        arr.append(char1[char.index(i)])

for i in arr:
    str1 = str1 + i
print(str1)
file = open("encryted2.txt", "w")
file.write(str1)
file.close()
