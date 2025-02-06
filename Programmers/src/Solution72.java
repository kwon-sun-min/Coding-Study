class Solution72 {
  public int solution(String my_string) {
      int answer = 0;
      String num = "";

      if(Character.isDigit(my_string.charAt(answer)))
      {
        my_string = '+' + my_string;
      }

      my_string = my_string.replace(" ", "");

      for (int i = my_string.length()-1; i >= 0; i--) 
      {
        char currentChar = my_string.charAt(i);

        if(Character.isDigit(currentChar))
        {
          num = currentChar + num;
        }

        else
        {
          if(currentChar == '+')
          {
            answer += Integer.parseInt(num);
            num = "";
          }

          else
          {
            answer -= Integer.parseInt(num);
            num = "";
          }
        }


      }

    return answer;

  }
}