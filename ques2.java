import java.util.*;
public class ques2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }  
      int start=0;
      int maxLen=0;
      int sum=0;
      for(int i=0;i<n;i++){

        sum+=arr[i];
        while(sum>=k){
            sum-=arr[start];
            start++;
        }
maxLen=Math.max(maxLen,i-start+1);
      }
      System.out.println(maxLen);
    }

}
