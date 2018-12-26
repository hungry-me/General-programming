//Compute n modulo d without division(/) and modulo(%) operators, where d is a power of 2 number.
package Bit;
import java.util.Scanner;
public class Modulo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt();
        int res=n&(d-1);
        System.out.println(res);
    }
}
