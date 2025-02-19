class Solution_Basic78 {
  public String[] solution(String my_str, int n) {
      String[] answer = new String[(int)Math.ceil(my_str.length()/(double)n)];
      for (int i = 0; i < answer.length; i++) 
      {
        if(my_str.length() > n*(i+1))
        {
          answer[i] = my_str.substring(n*(i), n*(i+1));
        }

        else
        {
          answer[i] = my_str.substring(n*i);
        }

      }
      
      return answer;
  }
}