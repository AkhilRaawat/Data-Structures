import java.util.Scanner;
import java .util.ArrayList;
public class Rotatearray {

    public static  void reversearray(ArrayList<Integer> list, int startindex, int endindex){
        int temp;
        while(startindex<endindex){
            temp=list.get(startindex);
            list.set(startindex,list.get(endindex));
            list.set(endindex,temp);
            startindex++;endindex--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int ele=0,i=0;
        System.out.println("Enter the elements in the list");
        while(true){
            ele=sc.nextInt();
            if(ele==-1)
                break;
            list.add(i++,ele);

        }
        System.out.println(list);
        int size=list.size();
        System.out.println("Enter the number of rotations");
        int rotations= sc.nextInt();
        reversearray(list,0,rotations-1);
        System.out.println(list);
        reversearray(list,rotations,size-1);
        System.out.println(list);
        reversearray(list,0,size-1);
        System.out.println(list);
    }
}
