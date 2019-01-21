#Given a sentence, task is to remove spaces from the sentence and rewrite in Camel case. It is a style of writing where we don’t have spaces and all words begin with capital letters.
def camelCase():
    s=input("Enter a string:");
    s=s.title();
    ls=s.split(" ");
    res="".join(ls);
    print(res);

camelCase();