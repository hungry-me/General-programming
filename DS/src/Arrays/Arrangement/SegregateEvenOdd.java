//Given an array of integers, segregate even and odd numbers in the array.
//All the even numbers should be present first, and then the odd numbers.
package Arrays.Arrangement;
import java.util.Arrays;
import java.util.Scanner;
public class SegregateEvenOdd {
    public static void rearrange(int ar[],int n){
        int i=-1,j=0;
        while (j!=n){
            if(ar[j]%2==0){
                i++;
                int tp=ar[i];
                ar[i]=ar[j];
                ar[j]=tp;
            }
            j++;
        }
        System.out.print("After rearrangement:");
        for (int k=0;k<n;k++)
            System.out.print(ar[k]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        rearrange(ar,n);
    }
}
