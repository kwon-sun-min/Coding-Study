class Solution77 {
  public int solution(int[] array) {
      int answer = 0;
      for (int i = 0; i < array.length; i++) 
      {
        String stringNum = Integer.toString(array[i]);

        for (int j = 0; j < stringNum.length(); j++) 
        {
          if(stringNum.charAt(j) == '7')
          {
            answer++;
          }
          
        }
        
      }
      return answer;
  }
}