package Arrays;

import java.util.List;

public class BuyAndSellStockTwo {
    
    public static double buyAndSellStockTwo(List<Double> prices) {

        double firstBuy = Double.MIN_VALUE;
        double firstSell = 0.0;
        double secondBuy = Double.MIN_VALUE;
        double secondSell = 0.0;

        for(double price : prices) {

            firstBuy = Math.min(firstBuy, -price);
            firstSell = Math.max(firstSell, firstBuy+price);

            secondBuy = Math.min(secondBuy, firstSell-price);
            secondSell = Math.max(secondSell, secondBuy+price);
        }
        return secondSell;
    }
}

// Time Complexity is O(N)
// Space Complexity is O(1)