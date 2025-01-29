package SortingAlgorithm;

public class SelectionSort {
    
public static int [] sel_sort (int arr []){

for(int i = 0;i<arr.length-1;i++){

int min_pos = i;

for(int j=i+1;j<arr.length;j++){

    if(arr[min_pos] > arr[j]){
        min_pos = j;
    }

}

int temp = arr[min_pos];
arr[min_pos] = arr[i];
arr[i] = temp;

}

return arr;

    }

    public static void main(String[] args) {
        

        int arr [] = {5,4,2,3,1};
        sel_sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
       

    }

}
