#Given a sentence, task is to rewrite in Google Case. It is a style of writing where we replace all lower case letters into upper case letters leaving the initial of all the words.
def googleCase():
    s=input("Enter a string:");
    i=0;
    print(s[i].lower(),end='');
    for i in range(1,len(s)-1):
        if(s[i]==' '):
            print(s[i],end='');
        if(s[i-1]==' '):
            print(s[i].lower(),end='');
        else:
            print(s[i].upper(),end='');
    print(s[i+1].upper());

googleCase();