//Given two variables, x and y, swap two variables without using a third variable.
package Bit;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
