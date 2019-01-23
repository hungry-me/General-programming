#Given a string that has set of words and spaces, write a program to move all spaces to front of string, by traversing the string only once.

def moveSpace():
    s=input("Enter a string:");
    cn=0;
    for i in range(len(s)):
        if(s[i]==' '):
            cn+=1;
    ls=s.split(" ");
    res="";
    for i in range(cn):
        res+=" ";
    for i in range(len(ls)):
        res+=ls[i];
    print(res);

moveSpace();