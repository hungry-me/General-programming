//Given two integers, write a function to multiply them without using multiplication operator.
package Bit;
import java.util.Scanner;
public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int res=0;
        while(b>0){
            if((b&1)!=0)
                res+=a;
            a=a<<1;
            b=b>>1;
        }
        System.out.println(res);
    }
}
