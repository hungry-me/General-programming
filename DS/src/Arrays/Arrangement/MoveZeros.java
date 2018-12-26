//Program to move all the 0's in an array to the end of array.
//Also maintain the order of the non zero elemens in array.
//Time Complexity:O(n) Space Complexity:O(1)
package Arrays.Arrangement;
import java.util.Arrays;
import java.util.Scanner;
public class MoveZeros {
    public static void rearrange(int ar[],int n){
        int cn=0;
        for (int j=0;j<n;j++){
            if(ar[j]!=0){
                ar[cn]=ar[j];
                cn++;
            }
        }
        for (int i=cn+1;i<n;i++)
            ar[i]=0;
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
        System.out.println("After rearranging:"+ Arrays.toString(ar));
    }
}
