//Find the Number Occurring Odd Number of Times.
package Bit;
import java.util.Scanner;
public class OddOccur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int res=0;
        for (int i=0;i<n;i++)
            res=res^ar[i];
        System.out.println(res);
    }
}
