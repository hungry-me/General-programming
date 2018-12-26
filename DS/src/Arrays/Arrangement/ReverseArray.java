//Given an array (or string), the task is to reverse the array/string.
//Time Complexity:O(n)
package Arrays.Arrangement;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int l=0,r=n-1;
        while (l<=r){
            int tp=ar[l];
            ar[l]=ar[r];
            ar[r]=tp;
            l++;
            r--;
        }
        System.out.println("Reverse array:"+ Arrays.toString(ar));
    }
}
