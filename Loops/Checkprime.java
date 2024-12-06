import java.util.*;
public class Checkprime {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=2;

if(n<=1){
    System.out.println("Its not a prime"); 
    return;
}

if(n==2){
    System.out.println("Its a prime"); 
    return;
}

        do{
         
           if(n%i==0){
            System.out.println("Its not a prime");
            return;
           }
           i++;
        }while(i<n);

          System.out.println("Its a prime");
    }

    

}