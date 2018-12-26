//Given an array of size n and multiple values around which we need to left rotate the array.
// How to quickly find multiple left rotations?
package Arrays.Rotation;
import java.util.Scanner;
public class QuicklyRotate {
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
        if(k>=n)
            k=k%n;
        System.out.print("Resultant display:");
        for (int i=k;i<k+n;i++)
            System.out.print(ar[i%n]+" ");
    }
}
