//Given an array of positive and negative numbers, arrange them such that all negative integers appear before all
//the positive integers in the array without using any additional data structure like hash table, arrays, etc.
//The order of appearance should be maintained.
package Arrays.Arrangement;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange6 {
    public static void rearrange(int ar[],int n){
        int k,j;
        for (int i=1;i<n;i++){
            k=ar[i];
            if(k>0)
                continue;
            j=i-1;
            while(j>=0 && ar[j]>0)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=k;
        }
        System.out.println("After rearrangements:"+ Arrays.toString(ar));
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
