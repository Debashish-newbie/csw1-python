import sys
def add(a,b):
    print(a+b)
def sub(a,b):
    print(a-b)
def mul(a,b):
    print(a*b)
def div(a,b):
    if b == 0:
        print("Division by 0 not possible")
    else:
        print(a/b)

op = sys.argv[1]       
if op!= "exit":
    a,b =  int(sys.argv[2]), int(sys.argv[3])
    menu = {"add":add, "sub":sub, "mul":mul, "div":div, "exit":exit }
    menu[op](a,b)
else:
    print("Exiting")
