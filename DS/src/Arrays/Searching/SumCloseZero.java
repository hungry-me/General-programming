// An Array of integers is given, both +ve and -ve.
// You need to find the two elements such that their sum is closest to zero.
package Arrays.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class SumCloseZero {
    public static void closeElements(int ar[],int n){
        Arrays.sort(ar);
        int i=0,j=n-1,sm=99999,li=0,lj=0;
        while (i<j){
            int tp=ar[i]+ar[j];
            if(sm>(int)Math.abs(tp)){
                sm=(int)Math.abs(tp);
                li=ar[i];
                lj=ar[j];
            }
            if(tp<0)
                i++;
            else
                j--;
        }
        System.out.println("Required elements:"+li+"\t"+lj);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        closeElements(ar,n);
    }
}
