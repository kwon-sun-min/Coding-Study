import java.util.Arrays;

class Solution_Basic63 {
  public int solution(int[] array, int n) {
      int answer = 0;
      int min = 100;

      for (int i = 0; i < array.length; i++) 
      {
        array[i] = array[i] - n;
      }

      Arrays.sort(array);

      for (int i = 0; i < array.length; i++) 
      {
        if(min > Math.abs(array[i]))
        {
          min = Math.abs(array[i]);
          answer = array[i] + n;
        }
      }

      return answer;
  }
}