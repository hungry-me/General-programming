#Given a string containing alphabets in lowercase and uppercase, find the maximum count of distinct lowercase alphabets present between two uppercase alphabets.
def maxLower():
    s=input("Enter a string:");
    i=0;
    for i in range(len(s)):
        if(s[i]>='A' and s[i]<='Z'):
            i+=1;
            break;
    mx=0;
    ls=[];
    for j in range(26):
        ls.append(0);
    for j in range(i,len(s)):
        if(s[j]>='A' and s[j]<='Z'):
            cn=0;
            for k in range(len(ls)):
                if(ls[k]>0):
                    cn+=1;
            mx=max(mx,cn);
            for y in ls:
                y=0;
        if(s[j]>='a' and s[j]<='z'):
            ls[ord(s[j])-ord('a')]+=1;
    print(mx);

maxLower();