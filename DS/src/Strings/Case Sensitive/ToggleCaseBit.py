#Given a string, write a function that returns toggle case of a string using the bitwise operators in place.
def toggleCase():
    s=input("Enter a string:");
    ls=list(s);
    for i in range(len(ls)):
        ls[i]=chr(ord(ls[i])^32);
    s="".join(ls);
    print(s);


toggleCase();