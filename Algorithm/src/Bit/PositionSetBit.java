//Given a number having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit.
package Bit;
import java.util.Scanner;
public class PositionSetBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),pos=1;
        boolean fl=false;
        while (n>1){
            int x=n&1;
            if (x==1)
            {
                fl=true;
                break;
            }
            pos++;
            n>>=1;
        }
        if(!fl)
            System.out.println("Position:"+pos);
        else
            System.out.println("Invalid Number");
    }
}
