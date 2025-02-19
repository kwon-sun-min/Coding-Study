import java.util.*;

class Solution_Kit07 {
  public int[] solution(int[] progresses, int[] speeds) {
      Queue<Integer> queue = new LinkedList<>();
      List<Integer> result = new ArrayList<>();

      for (int i = 0; i < progresses.length; i++) {
          int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
          queue.offer(days);
      }

      while (!queue.isEmpty()) {
          int current = queue.poll();  
          int count = 1;  

          
          while (!queue.isEmpty() && queue.peek() <= current) {
              queue.poll();
              count++;
          }

          result.add(count);
      }

      return result.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
      int[] progresses = {93, 30, 55};
      int[] speeds = {1, 30, 5};
      Solution_Kit07 sol = new Solution_Kit07();
      System.out.println(Arrays.toString(sol.solution(progresses, speeds))); 

      int[] progresses2 = {95, 90, 99, 99, 80, 99};
      int[] speeds2 = {1, 1, 1, 1, 1, 1};
      System.out.println(Arrays.toString(sol.solution(progresses2, speeds2))); 
  }
}
