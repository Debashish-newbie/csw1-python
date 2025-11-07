data=[]
tn = {0:"age", 1:"percentage", 2:"height", 3: "weight" }
for i in range (4):
    print("Enter your ", tn[i])
    data.append(int(input("Enter your")))

if (data[0]< 30 and data[1]>70 and data[2]>5.5 and data[3]< 65):
    print("Selected")
else:
    print("Not Selected")