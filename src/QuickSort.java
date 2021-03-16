package tavant;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {8,6,4,1,3};
        quickSort(a,0,a.length-1);
        for(int i : a){
            System.out.println(i);
        }
    }
    private static void quickSort(int a[], int lower, int upper){
        int pivot,left,right,temp;
        if(lower < upper){
            pivot = lower;
            left = lower+1;
            right = upper;
            while(left <= right){
                while(left <= upper && a[left] <= a[pivot]){
                    left++;
                }
                while(right >= lower && a[right] > a[pivot]){
                    right --;
                }
                if(left < right){
                    temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                }
            }
            temp = a[pivot];
            a[pivot] = a[right];
            a[right] = temp;
            pivot = right;
            quickSort(a,lower,pivot-1);
            quickSort(a,pivot+1,upper);
        }
    }
}
