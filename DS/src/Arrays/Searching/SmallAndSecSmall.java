//Write an efficient C program to find smallest and second smallest element in an array.
//Time Complexity:O(n)
package Arrays.Searching;

import java.util.Scanner;

public class SmallAndSecSmall {
    public static void getElements(int ar[],int n){
        int fs,sc;
        fs=sc=99999;
        for (int i=0;i<n;i++){
            if(ar[i]<fs){
                sc=fs;
                fs=ar[i];
            }
            else if(ar[i]<sc && ar[i]!=fs)
                sc=ar[i];
        }
        System.out.println("Required eleements:"+fs+" "+sc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        getElements(ar,n);
    }
}
