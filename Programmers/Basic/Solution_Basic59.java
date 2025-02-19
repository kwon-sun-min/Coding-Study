import java.util.Arrays;

class Solution_Basic59 {
  public int solution(int[] sides) {
      int answer = 0;
      int cal = 0;
      Arrays.sort(sides);

      for (int i = 0; i < sides.length -1; i++) 
      {
        cal += sides[i];
      }

      if(cal > sides[sides.length-1])
      {
        answer = 1;
      }

      else
      {
        answer = 2;
      }


      return answer;
  }

  
}