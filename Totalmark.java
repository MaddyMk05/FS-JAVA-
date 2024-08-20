import java.util.Scanner;
public class Totalmark{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the Dpt");
        String dpt=sc.nextLine();
        System.out.println("Enter the Mark of Java ");
        int java=sc.nextInt();
        System.out.println("Enter the Mark of Python ");
        int python=sc.nextInt();
        System.out.println("Enter the Mark of DBMS ");
        int DBMS=sc.nextInt();
        int Totalmark=java+python+DBMS;
        System.out.println("Totalmark"+Totalmark);
    }
}
