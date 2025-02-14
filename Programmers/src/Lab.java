import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Lab {
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) 
    {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        int time = 0;

        LinkedList<int[]> BridgeQueue = new LinkedList<>();
        Queue<Integer> WaitQueue = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) 
        {
            WaitQueue.add(truck_weights[i]);
        }

        while(!WaitQueue.isEmpty()  ||  !BridgeQueue.isEmpty())
        {
            int current = 0;

            for (int i = 0; i < BridgeQueue.size(); i++) 
            {
                if(BridgeQueue.get(i)[1] >= bridge_length)
                {
                    continue;
                }
                current += BridgeQueue.get(i)[0];
            }

            if(!WaitQueue.isEmpty()  &&  current + WaitQueue.peek() <= weight)
            {
                BridgeQueue.add(new int[]{WaitQueue.poll(), 0});
            }

            for (int i = 0; i < BridgeQueue.size(); i++) 
            {
                BridgeQueue.get(i)[1] += 1;
            }


            for (int i = 0; i < BridgeQueue.size(); i++) 
            {
                if(BridgeQueue.get(i)[1] > bridge_length)
                {
                    BridgeQueue.remove(BridgeQueue.get(i));
                }
                
            }
int a = 1;
            time++;


        }

        System.out.println(time);
        System.out.println(WaitQueue);

        
    }
    
}
