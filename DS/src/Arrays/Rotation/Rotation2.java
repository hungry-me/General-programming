////Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
//Time complexity : O(n * d)
//Auxiliary Space : O(1)
//Method: Rotate one element at time
package Arrays.Rotation;
import java.util.Scanner;
public class Rotation2 {
    public static void rotate(int ar[],int n,int d){
        //Rotating one element at a time
        for (int i=0;i<d;i++)
            rotateOne(ar,n);
        System.out.print("After rotation:");
        for (int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
    public static void rotateOne(int ar[],int n){
        int tp=ar[0];
        for (int i=0;i<n-1;i++)
            ar[i]=ar[i+1];
        ar[n-1]=tp;
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
