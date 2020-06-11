import random

char=[]
char1=[]
for i in range(32,127):
    char.append(chr(i))
    char1.append(chr(i))
random.seed(120)
random.shuffle(char1)
file = open("encryted2.txt", "r")
str0 = file.read()
file.close()
str1 = ""
arr = []
for i in str0:
   if i not in char:
       arr.append(i)
   else:
       arr.append(char[char1.index(i)])

for i in arr:
    str1 = str1 + i
print(str1)