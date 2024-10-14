public class RotatedBinarySearch {
    static int search(int[]arr,int target,int left,int right){

        if(left>right) return -1;
        int mid= (right+left)/2;
        if(arr[mid]==target) return mid;
        if(arr[left]<=arr[mid]){
            if(target>=arr[left] && target <= arr[mid]) {
              return search(arr,target,left,mid-1);
            }else{
                return search(arr,target,mid+1,right);
            }
        }else{
            if(target>=arr[mid] && target <= arr[right]) {
                return search(arr,target,mid+1,right);
              }else{
                  return search(arr,target,left,mid-1);
              }
        }
    
    }
    static int search(int[]arr,int target){
        return search(arr,target,0,arr.length-1);
    }
    public static void main(String[] args) {
        int []arr = {5,6,7,1,2,3,4};
        int target=3;
        // int left=0,right=arr.length-1;
        // while(left<=right){
        //     int mid= (right+left)/2;
        //     if(arr[mid]==target){
        //         System.out.println("Target found at index  "+ mid); 
        //         break;
        //     }
        //      //Checking if first half is sorted
        //         if(arr[left]<=arr[mid]){
        //             if(target>= arr[left] && target<= arr[mid]) right=mid-1;
        //             else left=mid+1;
        //      }else{
        //         if(target >= arr[mid] && target<= arr[right]) left=mid+1;
        //         else right=mid-1;
        //      }

        // }
        System.out.println(search(arr,target));
    }
}
