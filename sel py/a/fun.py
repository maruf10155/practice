import matplotlib.pyplot
import random
import numpy as np
q=0
w=[]
a=range(0,10000)
s=[random.randint(0,1)for i in a]
for i in a:
    if s[i-1]==1:
        q=q+1
        w.append(q)
    if s[i-1]==0:
        q=q-1
        w.append(q)
print(len(a),len(w),np.average(w))
matplotlib.pyplot.plot(list(a),w)
matplotlib.pyplot.grid(True)
matplotlib.pyplot.show()