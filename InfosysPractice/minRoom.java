import java.util.*;
public class minRoom {
    public static void main(String args[]){
        int[][] intervals = {{0,30},{5,10},{15,20}};
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] interval:intervals){
            if(!pq.isEmpty() && pq.peek()<=interval[0]){
                pq.poll();
            }
            pq.add(interval[1]);
        }
        System.out.println(pq.size());
    }
}
