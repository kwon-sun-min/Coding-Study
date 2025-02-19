class Solution_Basic33 {
  public int[] solution(int n) {
      int index = 0;
      int[] answer = new int[(int)Math.ceil(n/2.0)];

      for (int i = 1; i <= n; i += 2) 
      {
        answer[index++] = i;
      }
      return answer;
  }
}