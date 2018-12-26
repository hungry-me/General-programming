//Given an unsorted array and a number d,
//find if there exists a pair of elements in the array whose difference is d.
package Arrays.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class PairDiff {
    public static void getElements(int ar[],int n,int d){
        Arrays.sort(ar);
        int i=0,j=n-1,li=0,lj=0;
        boolean fl=false;
        while (i<j){
            int tp=ar[i]-ar[j];
            if((int)Math.abs(tp)==d){
                fl=true;
                li=ar[i];
                lj=ar[j];
                break;
            }
            else if(tp<d)
                i++;
            else
                j--;
        }
        if(fl)
            System.out.println("Required elements:"+li+" "+lj);
        else
            System.out.println("No such pair.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.print("Enter value of d:");
        int d=sc.nextInt();
        getElements(ar,n,d);
    }
}
