import java.util.*;
public class SubarraySum {
    public static void main (String args[]){
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
        ArrayList<Integer> result = subarray(arr, n, s);
        System.out.println(result);
    }
    static ArrayList<Integer> subarray(int[] arr, int n, int s){
    ArrayList<Integer> result = new ArrayList<>();
       int left=0;
       int sum=0;
       for(int right=0; right<n;right++){
        sum+=arr[right];
        while(sum>s &&left<=right){
            sum-=arr[left];
            left++;
        }
        if(sum==s){
            result.add(left+1);
            result.add(right+1);
            return result;
       }

    }
    result.add(-1);
    return result;
}
}