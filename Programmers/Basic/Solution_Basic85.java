class Solution_Basic85 {
  public int solution(int i, int j, int k) {
      int answer = 0;
      for (int l = i; l <= j; l++) 
      {
        String stringNum = Integer.toString(l);
        for (int m = 0; m < stringNum.length(); m++) 
        {
          if(stringNum.charAt(m) == Integer.toString(k).charAt(0))
          {
            answer += 1;
          }
        }
      }
      return answer;
  }

}