#Print all permutations of a string keeping the sequence but changing cases.

def permute(inp):
    n = len(inp);
    mx = 1 << n;
    inp = inp.lower();
    for i in range(mx):
        combination = [k for k in inp]
        for j in range(n):
            if (((i >> j) & 1) == 1):
                combination[j] = inp[j].upper();
        temp = "";
        for i in combination:
            temp += i;
        print(temp);

permute("ab");
