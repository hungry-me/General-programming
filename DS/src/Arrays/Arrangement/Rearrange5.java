//Given a sorted array of positive integers, rearrange the array alternately i.e
// first element should be maximum value, second minimum value, third second max, fourth second min and so on.
package Arrays.Arrangement;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange5 {
    public static void rearrange(int ar[],int n){
        int tp[]=new int[n];
        int l=0,h=n-1;
        boolean fl=true;
        for (int i=0;i<n;i++){
            if (fl)
                tp[i]=ar[h--];
            else
                tp[i]=ar[l++];
            fl=!fl;
        }
        System.out.println("After Rearrangements:"+ Arrays.toString(tp));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        rearrange(ar, n);
    }
}
