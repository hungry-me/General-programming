//Program to check wether two numbers have opposite signs or not.
package Bit;
import java.util.Scanner;
public class OppositeSigns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int x=a^b;
        if(x<0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
