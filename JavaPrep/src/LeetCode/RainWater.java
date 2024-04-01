package LeetCode;

public class RainWater {

    public static int maxArea(int[] height) {

        int area =0;
        int currentArea = 0;
        int maxArea = 0;

        for(int i =0; i < height.length; i++)
        {
            for(int j = i+1; j < height.length; j++)
            {
                currentArea = Math.min(height[i],height[j]) * (j - i);
                if(currentArea > maxArea)
                    maxArea = currentArea;

            }
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
