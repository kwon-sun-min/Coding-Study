import java.util.Arrays;

class Solution_Basic42 {
  public int[] solution(int[] emergency) {
      int[] answer = new int[emergency.length];
      int[] temp = emergency.clone();
      Arrays.sort(emergency);

      for (int i = 0; i < temp.length; i++) 
      {
        for (int j = 0; j < temp.length; j++) 
        {
          if(temp[i]  == emergency[j])
          {
            answer[i] = emergency.length - j;
          }
        }
        
      }


      return answer;
  }
}