import java.util.Scanner;
public class TwoStringDifference{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int x=str1.compareTo(str2);
        if (x<1) {
        System.out.println(str1 + " is greater than "+ str2);            
        }
        else if (x>1) {
        System.out.println(str2 + " is greater than "+ str1);            
        }
        else
        System.out.println("Equal Strings");
        sc.close();
    }
}