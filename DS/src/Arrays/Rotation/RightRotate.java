//Given an array, right rotate it by k elements.
package Arrays.Rotation;
import java.util.Scanner;
public class RightRotate {
    public static void reverse(int ar[],int l,int r){
        int tp;
        while (l<r){
            tp=ar[l];
            ar[l]=ar[r];
            ar[r]=tp;
            l++;
            r--;
        }
    }
    public static void rotate(int ar[],int n,int k){
        reverse(ar,0,n-1);
        reverse(ar,0,k-1);
        reverse(ar,k,n-1);
        System.out.print("After rotation:");
        for (int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter elements of array:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.print("Enter no of rotations:");
        int k=sc.nextInt();
        rotate(ar,n,k);
    }
}
