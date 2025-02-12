import java.util.*;

class Solution07 {
  public int[] solution(int[] progresses, int[] speeds) {
      Queue<Integer> queue = new LinkedList<>();
      List<Integer> result = new ArrayList<>();

      // 각 작업이 완료되기까지 걸리는 일 수 계산하여 큐에 저장
      for (int i = 0; i < progresses.length; i++) {
          int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
          queue.offer(days);
      }

      // 배포 과정
      while (!queue.isEmpty()) {
          int current = queue.poll();  // 첫 번째 작업이 완료되는 시점
          int count = 1;  // 이번 배포에서 몇 개가 배포되는지

          // 현재 작업이 완료되는 동안 함께 배포할 수 있는 작업 찾기
          while (!queue.isEmpty() && queue.peek() <= current) {
              queue.poll();
              count++;
          }

          result.add(count);
      }

      // 리스트를 배열로 변환 후 반환
      return result.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
      int[] progresses = {93, 30, 55};
      int[] speeds = {1, 30, 5};
      Solution07 sol = new Solution07();
      System.out.println(Arrays.toString(sol.solution(progresses, speeds))); // [2, 1]

      int[] progresses2 = {95, 90, 99, 99, 80, 99};
      int[] speeds2 = {1, 1, 1, 1, 1, 1};
      System.out.println(Arrays.toString(sol.solution(progresses2, speeds2))); // [1, 3, 2]
  }
}
