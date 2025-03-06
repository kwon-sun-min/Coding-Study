import java.util.*;

class Solution_Kit09 {
    public int solution09(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
                                                                   
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
            priorityQueue.offer(priorities[i]);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); 

            if (current[1] == priorityQueue.peek()) {
                priorityQueue.poll(); 
                answer++; 

                if (current[0] == location) {
                    return answer;
                }
            } else {
                queue.offer(current); 
            }
        }
        return answer;
    }
}
