import java.util.PriorityQueue;

class Lab
{
    public static void main(String[] args) 
    {
        int[] scovile = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int result = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i = 0; i < scovile.length; i++) 
        {
            queue.add(scovile[i]);
        }

        System.out.println(queue.peek());

        while(queue.peek() < k)
        {
            if(queue.size() <= 1)
            {
                System.out.println(-1);
                break;
            }
            int first = queue.poll();
            int second = queue.poll();
            queue.add(first + second * 2);
            result++;

        }

        System.out.println(result);
        System.out.println("sdfj");
    }

    
}