//Rotate bits of a number
package Bit;
import java.util.Scanner;
public class RotateBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt();
        //Bits size is 8
        int bit=8;
        //left rotate
        int lres=(n<<d)|(n>>(bit-d));
        System.out.println("Left Rotate:"+lres);
        //right rotate
        int rres=(n>>d)|(n<<(bit-d));
        System.out.println("Right Rotate:"+rres);
    }
}
