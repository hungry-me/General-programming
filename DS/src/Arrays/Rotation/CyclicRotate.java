//Given an array, cyclically rotate the array clockwise by one.
package Arrays.Rotation;
import java.util.Scanner;
public class CyclicRotate {
    public static void rotate(int ar[],int n){
        int tp=ar[n-1];
        for (int i=n-1;i>=1;i--)
            ar[i]=ar[i-1];
        ar[0]=tp;
        System.out.print("After Rotation:");
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
        rotate(ar,n);
    }
}
