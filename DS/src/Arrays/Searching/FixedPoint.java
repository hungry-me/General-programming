package Arrays.Searching;

import java.util.Scanner;

public class FixedPoint {
    public static int findFix(int ar[],int n){
        for (int i=0;i<n;i++){
            if(i==ar[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int res=findFix(ar,n);
        System.out.println("Result:"+res);
    }
}
