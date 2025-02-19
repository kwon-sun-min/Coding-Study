import java.util.PriorityQueue;

class TempSolution {
    public int solution(int[] scoville, int K)
    {
        int result = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) 
        {
            queue.add(scoville[i]);
        }

        while(queue.peek() < K)
        {
            if(queue.size() <= 1)
            {
                return -1;
            }
            int first = queue.poll();
            int second = queue.poll();
            queue.add(first + second * 2);
            result++;

        }
    
        return result;
    }
}
