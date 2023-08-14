public class Stocks {
    static void Buy_Sell(int[] arr) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buy_price < arr[i]) {
                int profit = arr[i] - buy_price;
                max_profit = Math.max(profit, arr[i - 1]);
            } else {
                buy_price = arr[i];
            }
        }
        System.out.println("So the maximum profit will be :- " + max_profit);
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        Buy_Sell(prices);
    }
}
