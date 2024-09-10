public class Mano{
    public static void main(String[] args){
        String santhoshh="monitor mouse keyboard";
       String arr[]= santhoshh.split(" ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
