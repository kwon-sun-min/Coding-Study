import java.util.Arrays;

class Solution011 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int index = 0; index < prices.length-1; index++)
        {
            int result = 0;
            for (int i = index+1; i < prices.length; i++) 
            {
                result++;
                if(prices[index] > prices[i])
                {
                    break;
                }

            }

            prices[index] = 0;
            answer[index] = result;
            
            
        }
        return answer;
    }

    public static void main(String[] args) 
    {
        int[] prices = {1, 2, 3, 2, 3};
        Solution011 sol = new Solution011();
        System.out.println(Arrays.toString(sol.solution(prices)));

    }
}