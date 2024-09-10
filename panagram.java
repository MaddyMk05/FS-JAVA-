public class Mano{
    public static void main(String[] args){
        String santhoshh="abcdefghijklmnopqrstuvwxyz";
        int fmaadhava[]= new int[26];
        int c=0;
        String m=santhoshh.toUpperCase();
        for (int i=0;i<santhoshh.length();i++){
            if(m.charAt(i)>='A'&& m.charAt(i)<='z')
            fmaadhava[m.charAt(i)-'A']++;
        }
        for(int i=0;i<26;i++){
            if(fmaadhava[i]>=1)
            c++;
        }
          if(c==26)
          System.out.print("panagram");
          else
          System.out.print("Not a panagram");
        }
    }
