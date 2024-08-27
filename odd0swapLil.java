public class main{
    public static void main(String[] args){
int n =12345; int rev=0,s=0;
for(int i=n;i>0;rev=rev*10+(i%10),i=i/10);
for (int i=rev;i>0;s=s*100+(i%100),i=i/100);
System.out.print(s);
}
}
