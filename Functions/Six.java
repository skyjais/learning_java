public class Six {
    //Decimal to binary 
    public static void decToBin(int n){
int binary_num = 0;
int power = 0;
 while (n>0){
  int rem_num = n%2;
    n=n/2;
    binary_num = binary_num + (rem_num *(int) Math.pow(10, power));
    power++;

 }

System.out.print("Decimal of "+ binary_num);

    }
    
    
    public static void main(String[] args) {
        // write your code here
        decToBin(7);
        
    }
}