package Arrayss;
import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        

        int value [] = {2,6,16,18,20,55,95};
        
        int start= 0; 
        int end = value.length-1;
        int key = 55;

        while (start<=end) {
            int mid = (start+end)/2;
                System.out.println(mid);
            if(value[mid] == key){
                System.out.println("Key exist in array "+ value[mid] + "," + mid);
                return;
            }else if (value[mid]<key){
                start=mid+1;
            }else if(value[mid]>key){
                end=mid-1;
            }
        }

        System.out.println("Key does not exist"+ start + "and" + end);
    }
}
