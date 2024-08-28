import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner aakash=new Scanner (System.in);
        String a=aakash.next();
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
    }
}
