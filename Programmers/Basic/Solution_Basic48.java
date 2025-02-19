class Solution_Basic48 {
  public int solution(int[] numbers, int k) {
      int answer = 1;

      for (int i = 1; i < k; i++) 
      {
        if((answer + 2) <= numbers.length)
        {
          answer += 2;
        }
        
        else
        {
          answer = (answer + 2) % numbers.length;
        }
      }

      return answer;
  }
}