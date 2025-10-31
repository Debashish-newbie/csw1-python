import sys

s = 0
for i in range(1, len(sys.argv)):
    s = s + int(sys.argv[i])
avg = s / (len(sys.argv) - 1)
print("Average:", avg)
