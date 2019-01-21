#Given a string find its first uppercase letter
def firstUp():
    s=input("Enter a string:");
    for i in range(len(s)):
        if(s[i]>='A' and s[i]<='Z'):
            print(s[i]);
            break;

firstUp();