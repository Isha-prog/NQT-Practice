import java.util.*;
class StringManip{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNext()){
            String st=sc.nextLine();
               int starCount=0;
                int hashCount=0;
            for(int i=0;i<st.length();i++){
             
                char ch=st.charAt(i);
                if(ch=='*'){
                    starCount++;
                }
                else if(ch=='#'){
                    hashCount++;
                }
            }
            int result=starCount-hashCount;
            System.out.println(result);
        }
    }
}