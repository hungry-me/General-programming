//An array contains both positive and negative numbers in random order.
//Rearrange the array elements so that positive and negative numbers are placed alternatively.
//Time Complexity:O(n)
//Space Complexity:O(1)
package Arrays.Arrangement;
import java.util.Arrays;
import java.util.Scanner;
public class PosAndNeg {
    public static void rearrange(int ar[],int n){
        int tp=0,i=-1;
        for (int j=0;j<n;j++){
            if(ar[j]<0)
            {
                i++;
                tp=ar[i];
                ar[i]=ar[j];
                ar[j]=tp;
            }
        }
        int pos=i+1,neg=0;
        while (pos<n && neg<pos && ar[neg]<0){
            tp=ar[pos];
            ar[pos]=ar[neg];
            ar[neg]=tp;
            neg+=2;
            pos++;
        }
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
