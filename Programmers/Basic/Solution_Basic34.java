import java.util.Arrays;

class Solution_Basic34 {
  public int solution(int[] array) {
      int answer = 0;
      int count = 0;
      int[] countTable = new int[1000];

      for (int i = 0; i < array.length; i++) 
      {
        countTable[array[i]]++;
      }

      for (int i = 0; i < countTable.length; i++) 
      {
        if(count < countTable[i])
        {
          count = countTable[i];
          answer = i;
        } 
      }

      Arrays.sort(countTable);

      if(countTable[999] == countTable[998])
      {
        answer = -1;
      }

      return answer;
  }
}