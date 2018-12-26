//Write a program to print Binary representation of a given number.
package Bit;
import java.util.Scanner;
public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder s=new StringBuilder();
        while (n!=0){
            s.append(n%2);
            n/=2;
        }
        System.out.println(s.reverse().toString());
    }
}
