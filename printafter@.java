import java.util.Scanner;
public class main{
    public static void main(String [] args){
        Scanner aakash=new Scanner(System.in);
        String a=aakash.next();
        for (int i=0;i<a.length();i++){
            if(a.charAt(i)=='@'){
            for (int j=i+1;j<a.length();j++){
                System.out.print(a.charAt(j));
            }
            }
            }
        }
}
