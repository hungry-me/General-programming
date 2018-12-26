//Count number of bits to be flipped to convert A to B
package Bit;
import java.util.Scanner;
public class FlipBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int res=a^b;
        int cn=0;
        while(res!=0){
            int x=res&1;
            if(x==1)
                cn++;
            res>>=1;
        }
        System.out.println(cn);
    }
}
