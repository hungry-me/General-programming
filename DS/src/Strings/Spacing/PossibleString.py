#Given a string you need to print all possible strings that can be made by placing spaces (zero or one) in between them
import math;
def possibleStr():
    s=input("Enter a string:");
    n=len(s);
    cn=int(math.pow(2,n-1));
    for i in range(cn):
        for j in range(n):
            print(s[j],end="");
            if(i & (1<<j)):
                print(" ",end="");
        print();

possibleStr();