//Given an array of numbers, arrange them in a way that yields the largest value.
//For example, if the given numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest value.
package Arrays.Arrangement;

import java.util.*;

public class BiggestNumber {
    public static void rearrange(Vector<String> ar){
        Collections.sort(ar, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy=x+y;
                String yx=y+x;
                return xy.compareTo(yx)>0 ? -1:1;
            }
        });
        Iterator it=ar.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> ar=new Vector<>();
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++)
            ar.add(sc.next());
        rearrange(ar);
    }
}
