package LeetCode;

import java.util.ArrayList;

public class BuySellStocks2 {

    public static int maxProfit(int[] prices) {


        ArrayList<Integer> ar = new ArrayList<>();
        for(int i =0; i < prices.length; i++)
        {
            int currProfit = 0;
            int overAllProfit =0;
            for(int j = i+1; j < prices.length; j++)
            {
                currProfit = prices[j] - prices[i];

                if(currProfit > overAllProfit)
                    overAllProfit = currProfit;
            }

            ar.add(overAllProfit);

        }

        int reqProfit = 0;

        for(int i =0; i < ar.size(); i++)
        {
            reqProfit = reqProfit + ar.get(i);
        }

        return reqProfit;

    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
