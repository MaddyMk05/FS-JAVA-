import java.util.Scanner;
public class mano{
    public static void main(String [] args){
        //decimal to binary
        int a=-10;
        System.out.print(Integer.toBinaryString(a));
        
        //binary to decimal
        int b=1010;
        String bb=Integer.toString(b);
        System.out.println(Integer.parseInt(bb,2));
        
        //decimal to octal
        int c=45;
        System.out.println(Integer.toOctalString(c));
        
        //octal to decimal
        int d=55;
        String aa=Integer.toString(d);
        System.out.println(Integer.parseInt(aa,8));
        
        //decimal to hexadecimal
        int e=1234;
        System.out.println(Integer.toHexString(e));
        
        //hexadecimal to decimal
        String f="4d2";
        System.out.println(Integer.parseInt(f,16));
        
    }
}   
