import java.util.Arrays;

public class BubbleSort {
    
    static void HelperSort(int []arr,int col,int row){
     if(col==0)return;
       if(col>row){
       if (arr[row]>arr[row+1]) {
        arr[row]=arr[row]+arr[row+1];
        arr[row+1]=arr[row]-arr[row+1];
        arr[row]=arr[row]-arr[row+1];
       }
       HelperSort(arr, col, row+1);
       }else{
        HelperSort(arr, col-1, 0);
       }
    }
    static void Sort(int[] arr){
        HelperSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int[] arr={34,46,12,56,7,12};
        Sort(arr);
    }
}
