package Arrayss;

public class TrappingRainWater {

    public static void get_rain (int arr []){
        int n = arr.length;
        int left_max [] =  new int [n];
        int right_max [] = new int [n];

        left_max[0] = arr[0];
        right_max[n-1] = arr[n-1];

        for(int i=1;i<n;i++){
            left_max[i] = Math.max(arr[i] , left_max[i-1]);
        }

        for(int i=n-2;i>=0;i--){
            right_max[i] = Math.max(arr[i] , right_max[i+1]);
            //System.out.println(right_max[i]);
        }



int trapWater = 0;

for(int i=0;i<n;i++){
    int water_label = Math.min(left_max[i],right_max[i]);
    trapWater = trapWater +  water_label - arr[i];
}

    
       
System.out.println(trapWater);
    }


public static void main(String[] args) {
    int arr [] = {4,2,0,6,3,2,5};
    get_rain(arr);
}
    
}