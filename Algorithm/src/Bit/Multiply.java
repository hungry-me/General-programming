//Program to multiply a number with 3.5
//You are not allowed to use %, /, *.
package Bit;
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=(n<<1)+n+(int)(n>>1);
        System.out.println(res);
    }
}
