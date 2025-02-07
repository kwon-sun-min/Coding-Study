class Solution91 {
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
    Solution91 sol = new Solution91();
    System.out.println(sol.solution(3));
  }
}