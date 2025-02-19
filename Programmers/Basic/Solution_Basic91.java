class Solution_Basic91 {
  public int solution(int n) {
      int answer = 0;
      for (int i = 1; i <= n; i++) 
      {
        answer++;
        while(answer%3 == 0 || Integer.toString(answer).contains("3"))
        {
          answer++;
        }
        
      }
      return answer;
  }

  public static void main(String[] args) {
    Solution_Basic91 sol = new Solution_Basic91();
    System.out.println(sol.solution(3));
  }
}