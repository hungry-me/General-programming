//Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
//Time Complexity : O(n)
//Method:
// Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1].
// The idea of the algorithm is :
//    Reverse A to get ArB, where Ar is reverse of A.
//    Reverse B to get ArBr, where Br is reverse of B.
//    Reverse all to get (ArBr) r = BA.

package Arrays.Rotation;
import java.util.Scanner;
public class Reversal {
    public static void rotate(int ar[],int n,int d){
        reverse(ar,0,d-1);
        reverse(ar,d,n-1);
        reverse(ar,0,n-1);
        System.out.print("After rotation:");
        for (int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
    public static void reverse(int ar[],int l,int r){
        int tp;
        while(l<r){
            tp=ar[l];
            ar[l]=ar[r];
            ar[r]=tp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter elements of array:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.print("Enter value of d:");
        int d=sc.nextInt();
        rotate(ar,n,d);
    }
}
