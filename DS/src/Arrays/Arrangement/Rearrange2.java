//You have been given an array and you have to make a program to convert that array such that positive elements
//occur at even numbered places in the array and negative elements occur at odd numbered places in the array.
//We have to do it in place and the relative order of the elements must be maintained.
//There can be unequal number of positive and negative values and the extra values have to left as it is.
package Arrays.Arrangement;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange2 {
    public static void rearrange(int ar[],int n){
        int pos=0,neg=1;
        while (true){
            while (pos<n && ar[pos]>=0)
                pos+=2;
            while (neg<n && ar[neg]<0)
                neg+=2;
            if(pos<n && neg<n){
                int tp=ar[pos];
                ar[pos]=ar[neg];
                ar[neg]=tp;
            }
            else
                break;
        }
        System.out.print("After rearrangement:"+ Arrays.toString(ar));
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
