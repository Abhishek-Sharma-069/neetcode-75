class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] nxtPrice = new int[n];
        Arrays.fill(nxtPrice,0);

        int max = 0;
        for(int i = n-1;i>=0; i--)
        {   int price = prices[i];
            if(max > price)
            {
                nxtPrice[i] = max;
            }else
            {
                nxtPrice[i] = 0;
                max = price;
            }
        }

        int result = 0;

        for(int i = 0; i<n; i++)
        {
            int price = prices[i];
            int nxtP  = nxtPrice[i];
            if(price < nxtP)
            {
                result = Math.max(result,Math.abs(nxtP-price));
            }
        }

        return result;
    }
}
