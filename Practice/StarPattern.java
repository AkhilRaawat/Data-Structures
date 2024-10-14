public class StarPattern{

    static void Pattern(int row ,int col){
        if(col==0)return;
       if(col>=row){
        System.out.print("*");
        Pattern(row+1, col);
       }else{
        System.out.println();
        Pattern(1, col-1);
       }
        
    }
    public static void main(String[] args) {
        Pattern(1, 5);
    }
}