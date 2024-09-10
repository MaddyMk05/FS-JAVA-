public class Mano{
    public static void main(String[] args){
        int madhan[]={1,1,1,2,2,3,4,4,4};
        int fmaadhava[]=new int[257];
        for (int i=0;i<9;i++){
            fmaadhava[madhan[i]]++;
        }
        for(int i=0;i<257;i++){
            if(fmaadhava[i]>0)
            System.out.println(i +" "+fmaadhava[i]);
        }
    }
}
