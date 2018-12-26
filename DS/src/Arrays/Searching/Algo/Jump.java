//Time Complexity:O(sqrt n)
package Arrays.Searching.Algo;
import java.util.Scanner;
public class Jump {
    public static int search(int ar[],int n,int k){
        int fr=(int)Math.floor(Math.sqrt(n));
        int prev=0;
        while (ar[(int)Math.min(fr,n)-1]<k){
            prev=fr;
            fr+=fr;
            if(prev>=n)
                return -1;
        }
        while (ar[prev]<k){
            prev++;
            if(prev==Math.min(fr,n))
                return -1;
        }
        if(ar[prev]==k)
            return prev;
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
        int pos=search(ar,n,k);
        if(pos!=-1)
            System.out.println("Element found at position:"+pos);
        else
            System.out.println("Element not present in array.");
    }
}
