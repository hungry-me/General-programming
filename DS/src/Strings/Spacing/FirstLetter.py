#A String str is given which contains lowercase English letters and spaces. It may contain multiple spaces. Get first letter of every word and return the result as a string. The result should not contain any space.

def firstLetter():
    s=input("Enter a string:");
    res=s[0];
    prev=s[0];
    for i in range(1,len(s)):
        if(s[i]==' ' and prev==' '):
            continue;
        elif(s[i]!=' ' and prev==' '):
            res+=s[i];
        prev=s[i];
    print(res);

firstLetter();