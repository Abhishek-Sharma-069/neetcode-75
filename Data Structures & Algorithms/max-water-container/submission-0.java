class Solution {
    public int maxArea(int[] heights) {
        int result = 0;

        int s = 0;
        int e = heights.length-1;

        while(s<e)
        {
            int area = Math.min(heights[s], heights[e]) * (e-s);

            result = Math.max(area,result);
            
            if(heights[s] < heights[e])
                s++;
            else if(heights[s] > heights[e])
                e--;
            else
            {
                s++;
                e--;
            }
        }

        return result;
    }
}
