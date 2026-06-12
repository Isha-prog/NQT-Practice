import java.util.*;
class RemString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        HashSet<Character> setb=new HashSet<>();
        for(int i=0;i<str2.length();i++){
      setb.add(str2.charAt(i));
            
        }
        StringBuilder str3=new StringBuilder();
        for(int i=0;i<str1.length();i++){
          char ch=str1.charAt(i);
          if(!setb.contains(ch)){
            str3.append(ch);
          }
        }
        System.out.println(str3.toString());
    }
}