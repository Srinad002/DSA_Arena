public class StockBuySell {
    public static void main(String[] args) {
        int[] arr={100,180,260,840,40,550,670};
        int max_profit=maximumProfit(arr);
        System.out.println(max_profit);
    }

    public static int maximumProfit(int[] arr){

        int i=0, j=1;
        int low, high, profit=0, max_profit=0;

        while(i<arr.length&& j<arr.length){

            if(arr[i]<arr[j]){
                low=arr[i];
                high=arr[j];
                profit=high-low;
            }else{
                i=j;
            }
            if(profit>max_profit){
                max_profit=profit;
            }

            j++;
        }

        return max_profit;
    }
}
