//Given an array, rearrange the array such that :
//    If index i is even, arr[i] <= arr[i+1]
//    If index i is odd, arr[i] >= arr[i+1]
package Arrays.Arrangement;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange3 {
    public static void rearrange(int ar[],int n){
        for (int i=0;i<n-1;i++){
            if(i%2==0 && ar[i]>ar[i+1]){
                int t=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=t;
            }
            else if(i%2!=0 && ar[i]<ar[i+1])
            {
                int t=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=t;
            }
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
