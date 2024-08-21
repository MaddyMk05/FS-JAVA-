import java.io.FileWriter;
import java.io.IOException;
public class writeFile {
	public static void main(String[] args) {
		 try{
	          FileWriter file = new FileWriter("Teachers.txt");
	          file.write("This is having the information of the students");
	          file.write("Name:- Maddy, Age: 24");
	          file.write("Name:- Madan, Age: 20");
	          file.close();
	          System.out.println("Some information  is written into the file");
	        }
	        catch (IOException e){
	            System.out.println("Error.........");
	            e.printStackTrace();
	        }
	}

}
