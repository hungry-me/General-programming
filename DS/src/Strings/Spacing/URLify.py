#Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the “true” length of the string.

def urlify():
    s,n=map(str,input("Enter the input:").split(","));
    n=n.strip(" ");
    n=int(n);
    res="";
    for i in range(n):
        if(s[i]==' '):
            res+='%20';
        else:
            res+=s[i];
    print(res);

urlify();