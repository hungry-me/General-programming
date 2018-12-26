//Time Complexity:O(log log n)
//Useful when array elements are uniformly distributed
package Arrays.Searching.Algo;
import java.util.Scanner;
public class Interpolation {
    public static int search(int ar[],int l,int h,int k){
        while(l<h){
            int m=l+((h-l)*(k-ar[l])/(ar[h]-ar[l]));
            if(ar[m]==k)
                return m;
            else if(ar[m]>k)
                h=m-1;
            else
                l=m+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter elements of array:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.print("Enter element to search:");
        int k=sc.nextInt();
        int pos=search(ar,0,n-1,k);
        if(pos!=-1)
            System.out.println("Element found at position:"+pos);
        else
            System.out.println("Element not present in array.");
    }
}
