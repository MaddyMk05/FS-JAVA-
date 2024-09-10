import java.util.Scanner;
public class mano{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char []ch= sc.nextLine().toCharArray();
        for  (int i=0;i<ch.length;i+=2){
        int n=ch[i+1]-'0';
        
        while(n-->0)
        System.out.print(ch[i]);
    }
}
}
