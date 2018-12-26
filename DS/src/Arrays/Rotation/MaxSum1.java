//Given an array, only rotation operation is allowed on array.
//We can rotate the array as many times as we want.
//Return the maximum possbile of summation of i*arr[i].
//Time Complexity:O(n)
package Arrays.Rotation;
import java.util.Scanner;
public class MaxSum1 {
    public static int getSum(int ar[],int n){
        int arsm=0,cmx=0;
        for (int i=0;i<n;i++){
            arsm+=ar[i];
            cmx+=i*ar[i];
        }
        int mx=cmx;
        for (int i=1;i<n;i++) {
            cmx = cmx + arsm - n * ar[n - i];
            if(mx<cmx)
                mx=cmx;
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter elements of array:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int sm=getSum(ar,n);
        System.out.println("Max sum value is:"+sm);
    }
}
