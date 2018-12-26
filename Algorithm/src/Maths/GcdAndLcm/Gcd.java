//Program to find Gcd of two numbers.
package Maths.GcdAndLcm;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        while (a!=b)
        {
            if(a<b)
                b=b-a;
            else
                a=a-b;
        }
        System.out.println("Gcd is:"+a);
    }
}
