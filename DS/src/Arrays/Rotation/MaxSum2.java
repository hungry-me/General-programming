//Given an array, only rotation operation is allowed on array.
//We can rotate the array as many times as we want.
//Return the maximum possbile of summation of i*arr[i].
//Time Complexity:O(n)
package Arrays.Rotation;
import java.util.Scanner;
public class MaxSum2 {
    public static int getSum(int ar[],int n){
        int p=getPivot(ar,n);
        int dif=n-1-p;
        int sm=0;
        for (int i=0;i<n;i++)
            sm+=((i+dif)%n)*ar[i];
        return sm;
    }
    public static int getPivot(int ar[],int n){
        for (int i=0;i<n;i++){
            if(ar[i]>ar[(i+1)%n])
                return i;
        }
        return 0;
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
