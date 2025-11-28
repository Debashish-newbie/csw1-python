import sys
num = [int(sys.argv[i]) for i in range(1,len(sys.argv))]
print(num)
print("Sum", sum(num))