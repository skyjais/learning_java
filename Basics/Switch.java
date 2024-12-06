public class Switch {
    public static void main(String[] args) {
        // write your code here

       int number = 1;

        switch(number%2){
            case 0   : System.out.println("Even");
            break;
            case 1 :  System.out.println("Odd");
            break;
            default : System.out.println("Not a number");
        }
        
    }
}