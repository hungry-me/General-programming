//Program to find whether a no is power of two
package Bit;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean fl=false;
        while (n > 1) {
            int x=n&1;
            if(x==1)
            {
                fl=true;
                break;
            }
            n>>=1;
        }
        if(!fl)
            System.out.println("is power of 2");
        else
            System.out.println("is not a power of 2");
    }
}
