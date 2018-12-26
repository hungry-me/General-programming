//Given an array of elements of length N, ranging from 0 to N – 1.
//All elements may not be present in the array.
//If element is not present then there will be -1 present in the array.
//Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
//Time Complexity:O(n)

package Arrays.Arrangement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Rearrange1 {
    public static void result(int ar[],int n){
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<n;i++)
            hs.add(ar[i]);
        for (int i=0;i<n;i++)
        {
            if(hs.contains(i))
                ar[i]=i;
            else
                ar[i]=-1;
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
        result(ar,n);
        System.out.println("Reultant array:"+ Arrays.toString(ar));
    }
}
