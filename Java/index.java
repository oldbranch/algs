package Java;

public class index {
    
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        MergeSort.Sort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}
