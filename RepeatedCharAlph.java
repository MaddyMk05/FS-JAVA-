public class Mano{
    public static void main(String[] args){
        String santhoshh="thols bought a new specs";
        int fmaadhava[]= new int[257];
        int c=0;
        char[] m=santhoshh.toCharArray();
        for (int i=0;i<m.length;i++){
            fmaadhava[m[i]]++;
        }
        for(int i=0;i<257;i++){
            if(fmaadhava[i]>1 && i!=32)
            System.out.print((char)i+" ");
        }
    }
}
