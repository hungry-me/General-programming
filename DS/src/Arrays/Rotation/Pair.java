//Given an array that is sorted and then rotated around an unknown point.
// Find if array has a pair with given sum ‘x’.
// It may be assumed that all elements in array are distinct.
//Time Complexity:O(n)
package Arrays.Rotation;
import java.util.Scanner;
public class Pair {
    public static boolean pair(int ar[],int n,int x){
        int i;
        for (i=0;i<n-1;i++)
            if(ar[i]>ar[i+1])
                break;
        int l=(i+1)%n;
        int r=i;
        while (l!=r){
            int sm=ar[l]+ar[r];
            if(sm==x)
                return true;
            else if(sm<x)
                l=(l+1)%n;
            else
                r=(r-1+n)%n;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter elements of array:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.print("Enter value to be searched:");
        int x=sc.nextInt();
        if(pair(ar,n,x))
            System.out.println("Pair exists in the array.");
        else
            System.out.println("Pair does not exists in the array.");
    }
}
