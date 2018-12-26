//Given an integer n, find whether it is a power of 4 or not.
package Bit;
import java.util.Scanner;
public class PowerOfFour {
    public static boolean check(int n){
        int x=n&(n-1);
        if(n>0 && x==0)
        {
            int cn=0;
            while(n>1)
            {
                n=n>>1;
                cn++;
            }
            if(cn%2==0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(check(n))
            System.out.println("is a power of 4");
        else
            System.out.println("is not a power of 4");
    }
}
