//A sorted array is rotated at some unknown point, find the minimum element in it.
//Following solution assumes that all elements are distinct.
package Arrays.Rotation;
import java.util.Scanner;
public class MinElement {
    public static int getMin(int ar[],int l,int h){
        if(h<l)
            return ar[0];
        if(l==h)
            return ar[l];
        int m=l+(h-l)/2;
        if(m<h && ar[m+1]<ar[m])
            return ar[m+1];
        if(m>l && ar[m]<ar[m-1])
            return ar[m];
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
        System.out.println("Minimum element is:"+nm);
    }
}
