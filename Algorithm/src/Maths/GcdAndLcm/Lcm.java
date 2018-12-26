//Program to find Lcm of two numbers.
package Maths.GcdAndLcm;
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int lcm=a*b;
        while (a!=b){
            if(a<b)
                b=b-a;
            else
                a=a-b;
        }
        System.out.println("Lcm is:"+(lcm/a));
    }
}
