import java.util.ArrayList;
public class CheckLastOccurence{
    static ArrayList<Integer> list=new ArrayList<>();

    static void helper(int [] arr,int target,int index){
        if(index == arr.length) return;
        if(arr[index]==target){
            list.add(index);
            helper(arr,target,index+1);
        }
        else helper(arr,target,index+1);
    }
    static void Occurence(int [] arr, int k){
        helper(arr,k,0);
    }
    public static void main(String[] args) {
        int []arr ={21,42,56,23,54,12,42};
        Occurence(arr, 42);
        for(int i : arr){
            System.out.print(i + " ");
        }
        
        System.out.println(list);
    }
}