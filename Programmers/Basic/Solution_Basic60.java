class Solution_Basic60 {
  public int solution60(int[] array, int height) {
      int answer = 0;
      for (int i = 0; i < array.length; i++) 
      {
        if(array[i] > height)
        {
          answer++;
        }
        
      }
      return answer;
  }
  
}

