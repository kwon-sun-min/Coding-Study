class Solution_Basic92 {
  public int solution(int[][] lines) {
      int[] graph = new int[201];
      int answer = 0;

      
      for (int i = 0; i < 3; i++) {
          for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
              graph[j]++; 
          }
      }

      
      for (int i = 0; i < 201; i++) {
          if (graph[i] >= 2) {
              answer++;
          }
      }

      return answer;
  }
}
