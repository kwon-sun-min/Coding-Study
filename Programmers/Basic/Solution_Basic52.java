class Solution_Basic52 {
  public int solution(int n) {
      int answer = 0;

      for (int i = 1; i <= 10; i++) 
      {
        if(n - factorial(i) == 0)
        {
          answer = i;
          break;
        }


        else if(n - factorial(i) < 0)
        {
          answer = i - 1;
          break;
        }
        
      }
      return answer;
  }

  public int factorial(int n)
  {

    if(n > 1)
    {
      return factorial(n-1) * n;
    }

    else
    {
      return 1;
    }
  }
}