package Java;

public class QuickSort {
    
    public static int partition(int[] a,int lo,int hi) {
        int p = a[lo];
        int i = lo, j = hi + 1;

        while(true) {
            while(a[++i] < p) if (i == hi) break;
            while(a[--j] > p) if (j == lo) break;
            if (i >= j) break;
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
        int t = a[lo];
        a[lo] = a[j];
        a[j] = t;
        return j;
    }

    public static void Sort(int[] a,int lo,int hi) {
        if (hi <= lo) return;
        int j = partition(a,lo,hi);
        Sort(a,lo,j-1);
        Sort(a,j+1,hi);
    }

    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        Sort(a, 0, 4);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }
}
