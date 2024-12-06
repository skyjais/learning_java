import java.util.*;
public class Two {
/*

formal parameters --  while receving value
actual parameters -- while calling funcion that value

 */
    
    public static void sum (int a, int b){//parameters or formal parameters
     int temp = a;
     a=b;
     b=temp;

    System.out.println( "a " + a + " b "+ b);

    }


    public static void main(String[] args) {
        // write your code here
     //Scanner sc = new Scanner(System.in);
     int a = 5;
     int b = 10;
     sum(a,b);

 System.out.println( "in a " + a + " inb "+ b);

     //arguments or actual arguments
        
    }
}