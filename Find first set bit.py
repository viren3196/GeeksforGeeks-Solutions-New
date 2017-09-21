import math
t = int(input().strip())
for i in range(t):
    num = int(input().strip())
    if num!=0:
        num = num&-num
        print (int(math.log(num,2))+1)
    else:
        print (0)
