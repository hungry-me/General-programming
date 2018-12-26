//Given a string, write a program to count the occurrence of Lowercase characters, Uppercase characters,
//Special characters and Numeric values.
package Strings.CharacterCount;
import java.util.Scanner;
public class Count1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int up=0,lw=0,num=0,sp=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z')
                up++;
            else if(c>='a' && c<='z')
                lw++;
            else if(c>='0' && c<='9')
                num++;
            else
                sp++;
        }
        System.out.println("Upper:"+up);
        System.out.println("Lower:"+lw);
        System.out.println("Number:"+num);
        System.out.println("Special:"+sp);
    }
}
