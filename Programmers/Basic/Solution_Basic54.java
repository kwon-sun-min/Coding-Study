import java.util.Collections;
import java.util.LinkedList;

public class Solution_Basic54 {
  public LinkedList<Integer> solution(String my_string) {
      LinkedList<Integer> answer = new LinkedList<>();

      for (int i = 0; i < my_string.length(); i++) 
      {
        if(Character.isDigit(my_string.charAt(i)))
        {
          answer.add(Character.getNumericValue(my_string.charAt(i)));
        }
      }

      Collections.sort(answer);

      return answer;
  }
   
  
}
