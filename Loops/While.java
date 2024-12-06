import java.util.*;
public class While {
    public static void main(String[] args) {
        // write your code here
        Scanner sc  =  new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        int i=0;
        while(i<=range){
           
            sum=sum+i;
            i++;
        }

         System.out.println("Sum : " + sum);
        
    }
}