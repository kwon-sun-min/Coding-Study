class Solution69 {
  public String solution(String s) {
      String answer = "";
      int[] alpha = new int[26];
      for (int i = 0; i < s.length(); i++) 
      {
        alpha[(int)s.charAt(i)-97]++;
      }

      for (int i = 0; i < alpha.length; i++) 
      {
        if(alpha[i] == 1)
        {
          answer += (char)(i+97);
        }
      }
      return answer;
  }

  public static void main(String[] args) {
    Solution69 sol = new Solution69();
    System.out.println(sol.solution("hello"));
  }
}