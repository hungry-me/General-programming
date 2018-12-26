//Given an array of integers which is initially increasing and then decreasing,
//find the maximum value in the array.
package Arrays.Searching;

import java.util.Scanner;

public class MaxIncDec {

    /*
        Linear Search Approach
        public static int getElement(int ar[],int n){
            int m=0;
            for (int i=1;i<n;i++)
            {
                if(ar[i]>ar[m])
                    m=i;
            }
            return m;
        }

    */

    //Binary search approach
    public static int getElement(int ar[],int l,int h){
        if(h==l)
            return l;
        if((h==l+1) && ar[h]>ar[l])
            return h;
        else if((h==l+1) && ar[h]<ar[l])
            return l;
        int m=(l+h)/2;
        if(ar[m]>ar[m-1] && ar[m]>ar[m+1])
            return m;
        else if(ar[m]>ar[m-1] && ar[m]<ar[m+1])
            return getElement(ar,m+1,h);
        return getElement(ar,l,m-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int res=getElement(ar,0,n-1);
        System.out.println("Result:"+ar[res]);
    }
}
