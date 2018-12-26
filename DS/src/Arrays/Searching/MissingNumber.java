//You are given a list of n-1 integers and these integers are in the range of 1 to n.
// There are no duplicates in list.
// One of the integers is missing in the list.
// Write an efficient code to find the missing integer.
package Arrays.Searching;

import java.util.Scanner;

public class MissingNumber {
    public static void miss(int ar[],int n){
        int x1,x2;
        x1=ar[0];
        for (int i=1;i<n;i++)
            x1^=ar[i];
        x2=1;
        for (int i=2;i<=n+1;i++)
            x2^=i;
        int x3=x1^x2;
        System.out.println("Missing Number is:"+x3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        miss(ar,n);
    }
}
