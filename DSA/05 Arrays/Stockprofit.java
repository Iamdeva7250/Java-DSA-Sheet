public class Stockprofit {

        static int maxProfit(int[] price, int n) {
            int profit = 0;

            // Traverse through the array
            for (int i = 1; i < n; i++) {
                // If current price is greater than previous price
                if (price[i] > price[i - 1]) {
                    profit += (price[i] - price[i - 1]);
                }
            }
            return profit;
        }

        public static void main(String[] args) {
            int[] price = {100, 180, 260, 310, 40, 535, 695};
            int n = price.length;

            System.out.println("Maximum Profit = " + maxProfit(price, n));
        }
    }
