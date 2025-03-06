import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution_Kit19 
{
    public int[] solution(String[] operations)
    {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        
        for (int i = 0; i < operations.length; i++) 
        {
            if(operations[i].charAt(0) == 'I')
            {
                maxQueue.add(Integer.parseInt(operations[i].split(" ")[1]));
                minQueue.add(Integer.parseInt(operations[i].split(" ")[1]));
            }

            else if(operations[i].equals("D -1"))
            {
                maxQueue.remove(minQueue.poll());
            }

            else if(operations[i].equals("D 1"))
            {
                minQueue.remove(maxQueue.poll());
            }
        }

        if(maxQueue.isEmpty())
        {
            return new int[] {0, 0};
        }

        else
        {
            return new int[] {maxQueue.poll(), minQueue.poll()};
        }
    }

    public static void main(String[] args) 
    {
        Solution_Kit19 sol = new Solution_Kit19();
        String[] input1 = {"I 100", "I 90", "I 80", "D 1", "D 1", "I 95", "I 105", "D -1", "D -1"};
        String[] input2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

        System.out.println(Arrays.toString(sol.solution(input1)));
        System.out.println(Arrays.toString(sol.solution(input2)));
        
    }
    
}
