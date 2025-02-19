class Solution_Basic36 {
  public int GetBCD(int a, int b)
  {
    int temp = 0;

    while(b!=0)
    {
      temp = a % b;
      a = b;
      b = temp;
    }
    
    return a;
  }

  public int GetLCM(int a, int b)
  {
    int LCM = a * b / GetBCD(a, b);
    return LCM;
  }


  public int solution(int n) {
      int answer = GetLCM(6, n)/6;
      
      return answer;
  }

}