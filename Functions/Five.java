public class Five {
//Decimal to Binary conversion

public static void convertBtoD(int num){

 int dec = 0;

for(int i=0;num>0;i++){

   int last_digit = num % 10;
   int left_num = num /10;
   num = left_num;

     dec = dec + ( last_digit * (int) Math.pow(2,i)) ;
}

System.out.println(dec);
}


    public static void main(String[] args) {
        // write your code here
        convertBtoD(01010);
        
    }
}