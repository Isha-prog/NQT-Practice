import java.util.*;
public class noOfSundays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String month=sc.nextLine();
        int n=sc.nextInt();
        String arr[]={"mon","tue","wed","thu","fri","sat","sun"};
        int startIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(month))
                startIndex=i;
            break;
        }
    
    int sundayCount=1;
    for(int i=0;i<n;i++){
        int current=( startIndex +i)%7;
        if(arr[current].equals("sun")){
            sundayCount++;
        }
    }
    System.out.println(sundayCount);
}
}
