//Given the Numerator and Denominator of N fractions.
// The task is to find the product of N fraction and output the answer in reduced form.
package Maths.GcdAndLcm;
import java.util.Scanner;
public class ProductFraction {
    public static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for (int i=0;i<n;i++)
            num[i]=sc.nextInt();
        int den[]=new int[n];
        for (int i=0;i<n;i++)
            den[i]=sc.nextInt();
        int pnm=1,pdn=1;
        for (int i=0;i<n;i++)
        {
            pnm*=num[i];
            pdn*=den[i];
        }
        int res=gcd(pnm,pdn);
        pnm/=res;
        pdn/=res;
        System.out.println("Resultant Fraction is:  "+pnm+"/"+pdn);
    }
}
