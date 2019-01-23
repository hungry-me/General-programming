#You are given an array of characters which is basically a sentence. However there is no space between different words and the first letter of every word is in uppercase. You need to print this sentence after following amendments:
#(i) Put a single space between these words.
#(ii) Convert the uppercase letters to lowercase

def putSpaces():
    s=input("Enter a string:");
    res=s[0].lower();
    for i in range(1,len(s)):
        if(s[i].isupper()):
            res+=" "+s[i].lower();
        else:
            res+=s[i];
    print(res);

putSpaces();