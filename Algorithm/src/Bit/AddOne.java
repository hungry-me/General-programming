//Program to add 1 to a given number
//Note: in bitwise ~ of n gives -(n+1)...... Ex ~13=-14
package Bit;
import java.util.Scanner;
public class AddOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=~a;
        System.out.println(-res);
    }
}
