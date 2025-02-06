class Solution87 {
  public int solution(String my_string) {
      int answer = 0;
      String Num = "";
      for (int i = 0; i < my_string.length(); i++) 
      {
        if(Character.isDigit(my_string.charAt(i)))
        {
          Num = Num + my_string.charAt(i);
        }

        else if(!Num.equals(""))
        {
          answer += Integer.parseInt(Num);
          Num = "";
        }

        else
        {
          Num = "";
        }
      }

      if(!Num.equals(""))
      {
        answer += Integer.parseInt(Num);
      }
      
      return answer;
  }

  public static void main(String[] args) {
    Solution87 sol = new Solution87();
    System.out.println(sol.solution("assdf12f123"));
  }
}