import java.util.LinkedList;

class Solution {
  public LinkedList<String> solution(String[] quiz) {
      LinkedList<String> answer = new LinkedList<String>();
      for (int i = 0; i < quiz.length; i++) 
      {
        String[] folma = quiz[i].split(" ");
        
        int num1 = Integer.parseInt(folma[0]);
        char currentop = folma[1].charAt(0);
        int num2 = Integer.parseInt(folma[2]);
        int result = Integer.parseInt(folma[4]);

        if(currentop == '+')
        {
          if(result == num1 + num2)
          {
            answer.add("O");
          }

          else
          {
            answer.add("X");
          }
        }

        else
        {
          if(result == num1 - num2)
          {
            answer.add("O");
          }

          else
          {
            answer.add("X");
          }
        }
      }

      return answer;
  }
}

