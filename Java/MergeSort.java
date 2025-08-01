package Java;

public class MergeSort {
    static int[] aux = new int[10];
    public static void Merge(int[] a,int lo,int mid,int hi) { 
        for (int i = lo;i <= hi;i++) aux[i] = a[i];
        for (int i = lo,j = mid+1,k = lo;k <= hi;k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[i] < aux[j]) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }

    public static void Sort(int[] a,int lo,int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        Sort(a,lo,mid);
        Sort(a,mid+1,hi);
        Merge(a,lo,mid,hi);
    }
    public static void main(String[] args) {
        int[] nums = {5, 3, 7, 8, 1, 6, 3, 9};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        Sort(nums, 0, 7);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
