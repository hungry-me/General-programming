//Search an element in a sorted and rotated array
//Time Complexity: O(log n)
//Method: similar to that of binary search.
//1) Find middle point mid = (l + h)/2
//2) If key is present at middle point, return mid.
//3) Else If arr[l..mid] is sorted
//    a) If key to be searched lies in range from arr[l]
//       to arr[mid], recur for arr[l..mid].
//    b) Else recur for arr[mid+1..r]
//4) Else (arr[mid+1..r] must be sorted)
//    a) If key to be searched lies in range from arr[mid+1]
//       to arr[r], recur for arr[mid+1..r].
//    b) Else recur for arr[l..mid]
package Arrays.Rotation;
import java.util.Scanner;
public class SortedRotated {
    public static int search(int ar[],int l,int h,int k){
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(ar[mid]==k)
            return mid;
        if(ar[l]<=ar[mid]){
            if(k>=ar[l] && k<=ar[mid])
                return search(ar,l,mid-1,k);

            return search(ar,mid+1,h,k);
        }
        if(k>=ar[mid] && k<=ar[h])
            return search(ar,mid+1,h,k);
        return search(ar,l,mid-1,k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter elements of array:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.print("Enter value to be searched:");
        int k=sc.nextInt();
        int pos=search(ar,0,n-1,k);
        if(pos!=-1)
            System.out.println("Poistion is:"+(pos+1));
        else
            System.out.println("Not found");
    }
}
