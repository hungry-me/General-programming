//Write a program to find position of first 1 from right to left, in binary representation of an Integer.
package Bit;
import java.util.Scanner;
public class PositionRightBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),pos=1;
        while (n>1){
            int x=n&1;
            if(x==1)
                break;
            pos++;
            n>>=1;
        }
        System.out.println(pos);
    }
}
