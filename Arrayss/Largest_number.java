package Arrayss;
import java.util.*;

public class Largest_number {

    public static void main(String[] args) {

        int marks[] = {12, 45, 27, 288, 38, 98};

        int largest = Integer.MIN_VALUE;
    
        for(int i = 0; i<marks.length;i++){
    
            if(largest<marks[i]){
                largest=marks[i];
            }
    
        }

        System.out.println(largest + " is Largest Number");
        
    }  

}
