import java.util.Scanner;
public class mano{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="Mohammed samiqkhan frnd of madhu";
       len=s.length();
       System.out.print(len);
       
        char charindex=s.charAt(5);       
        System.out.print(charindex);
        
        String substring = s.substring(5);
        System.out.print(substring);
        
        String substring=s.substring(4,9);
        System.out.print(subindex);
        
        int indexof=s.indexOf('o');
        System.out.print(indexof);
        
        int indexfromchar=s.n=indexOf('o',10);
        System.out.print(indexfromchar);
        
        inr lastindexof=s.lastIndexof('o');
        System.out.print(lastindexof);
        
        String newstr=s.concat("redmi");
        Sysytem.out.print(newstr);
        
        String replaces=s.repeat('m','T');
        System.out.print(replace);
        
        String upper=s.toUpperCase();
        System.out.print(Upper);
        
        String Lower=s.toLowerCase();
        System.out.print(Lower);
        
        String trim="    hii hello  ".trim();
        System.out.print(trim);
        
        string []arr=s.split(",");
        for(String a:arr)
        System.out.print(a+);
        
        boolean startswith=s.startsWith("ohamme");
        System.out.print(startswith);
        
        boolean endswith=s.endWith("dhu");
        System.out.print(endWith);
        
        Sring str="mohammed samiq khan,frnd oof madhu";
        boolean iosequal=s.equals(str);
        System.out.print(isequal);
        
        boolean equals=s.equalsIgnoreCase("mohammed samiq khan,frnd oof madhu");
        System.our.print(equals);
        
    
        System.out.print(s.replaceFirst("m","a"));
        System.out,print(s.replaceAll("madhu","aakash"));
        
        String S1=" MOHAMMED samiq madhu,frnd oof madhu";
        int c=s.compareTo(S1);
        System.out.print(c);
        
        String S1=" MOHAMMED samiq madhu,frnd oof madhu";
        int c=s.compareToIgnoreCase(S1);
        System.out.print(c);
    }
}
