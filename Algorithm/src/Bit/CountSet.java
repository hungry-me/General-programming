//Write an efficient program to count number of 1s in binary representation of an integer.
package Bit;
import java.util.Scanner;
public class CountSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cn=0;
        while(n!=0){
            int x=n&1;
            if(x==1)
                cn++;
            n>>=1;
        }
        System.out.println(cn);
    }
}
