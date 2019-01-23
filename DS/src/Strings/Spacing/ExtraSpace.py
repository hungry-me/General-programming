#Given a string containing many consecutive spaces, trim all spaces so that all words should contain only a single space between them.

def extraSpace():
    s=input("Enter a string:");
    ver="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    s=s.strip(" ");
    res="";
    n=len(s);
    for i in range(n):
        if(s[i]==' ' and (s[i+1] not in ver)):
            continue;
        else:
            res+=s[i];
    print(res);

extraSpace();