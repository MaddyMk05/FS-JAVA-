public class main{
    public static void main(String[] args){
int n =12345;
int rev=0,s=0;
for(int i=n;i>0;i=i/10){
    int r=i%10;
    rev=rev*10+r;
}for (int i=rev;i>0;i=i/100){
    int r=i%100;
    s=s*100+r;
} 
System.out.print(s);
}
}
