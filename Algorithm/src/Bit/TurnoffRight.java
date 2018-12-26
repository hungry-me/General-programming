//Write a program that unsets the rightmost set bit of an integer.
package Bit;
import java.util.Scanner;
public class TurnoffRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=n&(n-1);
        System.out.println(res);
    }
}
