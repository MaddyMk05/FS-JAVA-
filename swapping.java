public class mano{
    public static void main(String[] args){
        String santhoshh="three maniku vita ";
        String arr[]= santhoshh.split(" ");
        for  (int i=0;i<arr.length-1;i+=2){
        String t=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=t;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
