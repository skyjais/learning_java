package SortingAlgorithm;

public class BubbleSort {
    
    public static int [] buble_sort(int arr []){

for(int i = 0;i<arr.length-1;i++){

    for(int j=0;j<arr.length-1-i;j++){

        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1]= temp;
        }

    }

}

return arr;

    }

    public static void main(String[] args) {
        
        int arr [] = {5,4,3,1,2};

        buble_sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }

}
