package com.melashvili.array;

public class BestTimeBuySellStocks {

    static int[] prices = {7, 3, 1, 4, 5};

    public static void main(String[] args) {
        int p = 0;
        int j = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[j] > prices[i]){
                j = i;
            }
            p = Math.max(p, prices[i] - prices[j]);
        }
        System.out.println("Profit: " + p);
    }
}
