public class Reverse {
    public static void reversearray(int[]arr,int startindex,int endindex){
        int temp;
        while(startindex<endindex){
            temp=arr[startindex];
            arr[startindex]=arr[endindex];
            arr[endindex]=temp;
            startindex++;endindex--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        reversearray(arr,0,4);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
