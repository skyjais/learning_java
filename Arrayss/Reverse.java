package Arrayss;

public class Reverse {

    public static void reverse_array(int arr []){

        int start = 0;
        int end = arr.length-1;
        int swap;

        while(start<end){

            swap=arr[start];
            arr[start]=arr[end];
            arr[end]=swap;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int arr [] = {2,1,6,3,9,5};
        reverse_array(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
