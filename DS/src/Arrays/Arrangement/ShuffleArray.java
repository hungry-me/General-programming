//Given an array, write a program to generate a random permutation of array elements.
//Time Complexity:O(n) Space Complexity:O(1)
package Arrays.Arrangement;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void shuffle(int ar[],int n){
        Random r=new Random();
        for (int i=n-1;i>0;i--){
            int j=r.nextInt(i);
            int tp=ar[j];
            ar[j]=ar[i];
            ar[i]=tp;
        }
        System.out.print("Shuffled Array:"+ Arrays.toString(ar));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        shuffle(ar,n);
    }
}
