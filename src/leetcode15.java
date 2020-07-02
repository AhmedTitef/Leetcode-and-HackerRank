public class leetcode15 {
    public static void main(String[] args) {
        System.out.println( maxProfit( new int[]{7,6,4,3,1} ) );
    }

    public static int maxProfit(int[] prices) {


        int profit = 0;
//        int buy;
        int x = 0;

        int nextDay = x + 1;

        for (int i = x; i < prices.length-1; i++) {

            if (nextDay < prices.length)
            if (prices[i] < prices[nextDay] ) {
                profit += prices[nextDay] - prices[i];

//                buy--;
            }
            nextDay ++;
        }
//
        return profit;
    }
}
