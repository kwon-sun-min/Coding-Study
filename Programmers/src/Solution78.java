class Solution78 {
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

  public static void main(String[] args) {
    String input1 = "abc1Addfggg4556b";
    System.out.println(Math.ceil(input1.length()/(double)6));
    System.out.println(input1.length());
  }
}