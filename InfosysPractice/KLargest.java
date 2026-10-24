import java.util.*;
public class KLargest {
    public static void main(String args[]){
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        int result = findKthLargest(arr,k);
        System.out.println(result);
    }
    static int findKthLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
