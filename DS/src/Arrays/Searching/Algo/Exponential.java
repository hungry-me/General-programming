//Time Complexity:O(log n)
//Useful in unbound searches i.e, when end is not known.
package Arrays.Searching.Algo;
import java.util.Arrays;
import java.util.Scanner;
public class Exponential {
    public static int search(int ar[],int n,int k){
        if(ar[0]==k)
            return 0;
        int i=1;
        while (i<n && ar[i]<=k)
            i=i*2;
        return Arrays.binarySearch(ar,i/2,i,k);
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
        int pos=search(ar,n,k);
        if(pos!=-1)
            System.out.println("Element found at position:"+pos);
        else
            System.out.println("Element not present in array.");
    }
}
