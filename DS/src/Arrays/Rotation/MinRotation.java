//Consider an array of distinct numbers sorted in increasing order.
//The array has been rotated (clockwise) k number of times.
//Given such an array, find the value of k.
//Time Complexity:O(n)
package Arrays.Rotation;
import java.util.Scanner;
public class MinRotation {
    public static int getMin(int ar[],int l,int h){
        if(h<l)
            return 0;
        if(l==h)
            return l;
        int m=l+(h-l)/2;
        if(m<h && ar[m+1]<ar[m])
            return m+1;
        if(m>l && ar[m]<ar[m-1])
            return m;
        if(ar[m]<ar[h])
            return getMin(ar,l,m-1);
        return getMin(ar,m+1,h);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.print("Enter elements of array:");
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int nm=getMin(ar,0,n-1);
        System.out.println("Minimum Rotations required are:"+nm);
    }
}
