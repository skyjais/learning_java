import java.util.*;
public class Four {

//Prime number and prime numbers in range
public static boolean isPrime(int n){
    boolean isPrime = true;

if(n==2){
    return true;
}

    // for(int i=2;i<=n-1;i++){
    //     if(n%i==0){
    //     isPrime= false;
    //     break;
    //     }

      
    // }

 
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
        isPrime= false;
        break;
        }

      
    }

      return isPrime;
}



public static void primeInRange(int n){

    for(int i=2;i<=n;i++){
    if(isPrime(i)){
        System.out.print(i+" ");
    }
}

 System.out.print(" are prime");

}

public static void main(String[] args) {
        // write your code here
        primeInRange(23);
        
    }
}