public class For {
    public static void main(String[] args) {
        // write your code here
int number = 123;
int rev = 0;
        for(int i=0; number>0; i++){
            
       int  digit = number % 10;
        rev = (rev * 10) + digit;
        number = number/10;

            
        }

        number = rev;

        System.out.print("Reverse :" +  number);
    }
}