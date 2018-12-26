//Given an array of integers, update every element with multiplication of previous and next elements with following exceptions.
//a) First element is replaced by multiplication of first and second.
//b) Last element is replaced by multiplication of last and second last.
//O(n) time and O(1) space.
package Arrays.Arrangement;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyPrevNext {
    public static void rearrange(int ar[],int n){
        int prev=ar[0];
        for (int i=0;i<n;i++){
            if(i==0)
                ar[i] = prev * ar[i + 1];
            else if(i==n-1)
                ar[i]=prev*ar[i];
            else
            {
                int tp=ar[i];
                ar[i]=prev*ar[i+1];
                prev=tp;
            }
        }
        System.out.print("After rearrangements:"+ Arrays.toString(ar));
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