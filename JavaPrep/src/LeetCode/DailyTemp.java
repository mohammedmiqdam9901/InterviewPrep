package LeetCode;

import java.util.Stack;

public class DailyTemp {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {73,74,75,71,69,72,76,73};
        int result[] = dailyTemperatures(arr);

        for(int i =0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }


    }
}
