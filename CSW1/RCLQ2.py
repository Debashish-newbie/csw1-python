# Q WAP TO FINF ROOTS OF THE QUADRATIC EQUATION WHERE THE COFFICIENT OF EQUATION ARE PASSED THROUGH RUNTIME CMD
import sys
import math
a,b,c = int(sys.argv[1]), int(sys.argv[2]), int(sys.argv[3])
print("Value of a:", sys.argv[1])
print("Value of b:", sys.argv[2])
print("Value of c:", sys.argv[3])

root1 = ((-b + math.sqrt(math.pow(b,2)-(4*a*c)))/(2*a))
root2 = ((-b - math.sqrt(math.pow(b,2)-(4*a*c)))/(2*a))

print("Roots of %dx^2 + %dx + %d are %f and %f " %(a,b,c, root1, root2))
