//Efficient way to multiply with 7
package Bit;
import java.util.Scanner;
public class Multiply7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=(n<<3)-n;
        System.out.println(res);
    }
}
