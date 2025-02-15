import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

class Lab
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();
        int[] prices = {1,2,3,2,3};
        int[] answer = new int[prices.length];     

        for (int i = 1; i < answer.length; i++) 
        {
            stack.add(prices[i]);

            for (int j = 0; j < stack.size(); j++) 
            {
                if(prices[j] > prices[i])
                {
                    continue;
                }
                answer[j]++;

            }
            
        }

        System.out.println(Arrays.toString(answer));
        System.out.println(stack.peek());
    }
}