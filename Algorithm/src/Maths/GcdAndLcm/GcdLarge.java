//Given two numbers ‘a’ and ‘b’ such that (0 <= a <= 10^12 and b <= b < 10^250).
// Find the GCD of two given numbers.
package Maths.GcdAndLcm;
import java.util.Scanner;
public class GcdLarge {
    public static long gcd(long a,long b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static long reduce(long a,String b){
        long res=0;
        for (int i=0;i<b.length();i++)
            res=((res*10)+b.charAt(i)-'0')%a;
        return res;
    }
    public static void gcdLarge(long a,String b)
    {
        long res=reduce(a,b);
        long gc=gcd(res,a);
        System.out.println("Gcd is:"+gc);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        String b=sc.next();
        gcdLarge(a,b);
    }
}
