import java.util.Arrays;

public class leetcode7 {


    public static void main(String[] args) {
        System.out.println( Arrays.toString( finalPrices( new int[]{8, 4, 6, 2, 3} ) ) );
    }
    public static int[] finalPrices(int[] prices) {
        int i = 0;
        int j = 0;
        int [] result = new int [prices.length];
        for ( i = 0 ; i< prices.length-1  ; i++){
            System.out.println(i);
            j = i+ 1;

            System.out.println(j);
            System.out.println("-------");
            while (j > i && j < prices.length){

                if (prices[i] >= prices[j] ) {

                    result[i] = prices[i] - prices[j];
                    break;
                }else {
                    result[i] = prices[i];
                    result[prices.length - 1] = prices[prices.length - 1];
                    j++;

                }
            }






        }
        return result;
    }
}
