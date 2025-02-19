class Solution_Basic64 {
  public int solution(int order) {
      int answer = 0;
      String data = String.valueOf(order);
      for (int i = 0; i < data.length(); i++) 
      {
        if(data.charAt(i) == '3'  ||  data.charAt(i) == '6'  ||  data.charAt(i) == '9')
        {
          answer++;
        }
      }

      return answer;
  }
}