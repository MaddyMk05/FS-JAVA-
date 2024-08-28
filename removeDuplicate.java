import java.util.Scanner;
import java.util.Arrays;
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
        Arrays.sort(santhosh);
        int soni[]=new int[100];
        for (int i=0;i<o;i++){
            soni[santhosh[i]]++;
        }
        for(int i1=0;i1<o;i1++){
            if (soni[santhosh[i1]]>0)
            System.out.print(santhosh[i1]);
            int k=0;
            soni[santhosh[k]]=0;
        }
    }
}  
