import java.util.*;
public class noOfVehicles {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
      
       if(!sc.hasNext()){
System.out.println("Invalid input");
return;
       } 
         int v=sc.nextInt();
          if(!sc.hasNext()){
System.out.println("Invalid input");
return;
       } 
        int w=sc.nextInt();
        if(w<2 || w%2!=0 || v<1 || w<(2*v)|| w>(4*v)){
            System.out.println("Invalid input");
return;
        }
        int fw=(w-2*v);
        int tw=v-fw;
        System.out.println("tw"+tw);
        System.out.println("fw"+fw);
    }
}
