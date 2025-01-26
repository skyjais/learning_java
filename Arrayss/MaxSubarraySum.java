package Arrayss;

public class MaxSubarraySum {

    public static int print_subarray(int arr []){
        int maxSum = 0;
        for(int i = 0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                  
                  int Currentsum=0;
                for(int k=i;k<=j;k++){
                   // System.out.print(arr[k]+" ");
                   Currentsum=Currentsum+arr[k];
                }
                
                if(Currentsum>maxSum){
                    maxSum=Currentsum;
                }
            }
            
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int arr [] = {1,-2,6,-1,3};
        System.out.println(print_subarray(arr));
    }
}
