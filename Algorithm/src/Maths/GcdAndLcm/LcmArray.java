//Program to find the lcm of array
package Maths.GcdAndLcm;
import java.util.Scanner;
public class LcmArray {
    public static int gcd(int a,int b){
        while(a!=b){
            if(a<b)
                b=b-a;
            else
                a=a-b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int res=ar[0];
        for (int i=1;i<n;i++)
            res=(res*ar[i])/gcd(res,ar[i]);
        System.out.println("Lcm is:"+res);
    }
}
