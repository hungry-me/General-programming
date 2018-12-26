//Program to find Gcd of an array.
package Maths.GcdAndLcm;
import java.util.Scanner;
public class GcdArray {
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
        int n=sc.nextInt(),res;
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        res=ar[0];
        for (int i=1;i<n;i++)
            res=gcd(res,ar[i]);
        System.out.println("Gcd of array is:"+res);
    }
}
