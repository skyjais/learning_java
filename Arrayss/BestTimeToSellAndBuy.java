package Arrayss;
public class BestTimeToSellAndBuy {
    

    public static void main(String[] args) {
        
int arr [] = {7,1,5,3,6,4};

int buy_price = arr[0];
int mx_profit = 0;

for(int i=1;i<arr.length;i++){
int sell_price = arr[i];
    if(buy_price < sell_price){

        int curr_profit = sell_price - buy_price;

        if(curr_profit > mx_profit){
            mx_profit =curr_profit;
        }


    }else{

        buy_price = sell_price;

    }

}

System.out.println(mx_profit);

    }

}
