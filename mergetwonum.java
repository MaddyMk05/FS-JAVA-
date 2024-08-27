import java.util.Scanner;
public class main{
    public static void main(String [] args){
        Scanner aakash=new Scanner (System.in);
        int n = aakash.nextInt();
        int m = aakash.nextInt();
        int varuna[] = new int[n];
        int keerthana[]=new int[m]; 
        for (int i=0;i<n;i++){
            varuna[i]=aakash.nextInt();
        }
        for(int i=0;i<m;i++){
            keerthana[i]=aakash.nextInt();
        }
        int o=n+m;
        int santhosh[]=new int[o];
        int c=0;
        for (int i=0;i<n;i++){
            santhosh[c++]=varuna[i];
        }
        for (int i=0;i<m;i++){
            santhosh[c++]=keerthana[i];
        }
        for (int i=0;i<o;i++){
            System.out.print(santhosh[i]);
        }
    }
}  
