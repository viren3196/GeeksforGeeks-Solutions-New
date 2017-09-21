import math

def xor(num1,num2):
    return num1^num2
def rightSetBit(num):
    num = num&-num
    return math.log(num,2)+1

t = int(input())
for i in range(t):
    num1, num2 = input().split()
    num1, num2 = [int(num1), int(num2)]
    print (int(rightSetBit(xor(num1,num2))))
