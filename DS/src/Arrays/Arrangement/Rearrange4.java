//Given an unsorted array of both negative and positive integer.
//The task is place all negative element at the end of array without changing the order of
//positive element and negative element.
package Arrays.Arrangement;
import java.util.Arrays;
import java.util.Scanner;

public class Rearrange4 {
    public static void rearrange(int ar[],int n){
        int tp[]=new int[n];
        int j=0;
        for (int i=0;i<n;i++){
            if(ar[i]>=0)
                tp[j++]=ar[i];
        }
        for (int i=0;i<n;i++){
            if(ar[i]<0)
                tp[j++]=ar[i];
        }
        System.out.println("After rearrangements:"+ Arrays.toString(tp));
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
