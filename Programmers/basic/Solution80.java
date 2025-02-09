class Solution80 {
  public int solution(int[][] dots) {
      int answer = 0;
      int width = 0;
      int height = 0;
      
      for (int i = 1; i < 4; i++) 
      {
        if(dots[0][0] == dots[i][0])
        {
          height = dots[i][1] - dots[0][1];
          break;
        }
      }

      for (int i = 1; i < 4; i++) 
      {
        if(dots[0][1] == dots[i][1])
        {
          width = dots[i][0] - dots[0][0];
          break;
        }
        
      }

      answer = Math.abs(width * height);
      return answer;
  }
}