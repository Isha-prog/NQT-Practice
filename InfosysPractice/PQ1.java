import java.util.*;
class PQ1{
    public static void main(String[] args) {
        String s="ahhellllloou";
        String s1="hello";
        int count=0;
        int j=0;

        for(int i=0;i<s.length() && j<s1.length();i++){
          if(s.charAt(i)==s1.charAt(j)){
            count++;
            j++;
          }
        }
        if(count==5){  //If the count is equal to the length of s1, then it means s1 is a subsequence of s
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}