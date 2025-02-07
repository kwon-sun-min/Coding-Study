import java.util.Arrays;

class Solution51 {
  public int solution(int n) {
      int answer = 0;
      boolean[] prime = new boolean[n+1];
      Arrays.fill(prime, true);
      prime[0] = false;
      prime[1] = false;

      for (int i = 2; i <= Math.sqrt(n); i++) 
      {
        if(prime[i])
        {
          for (int j = i*i; j <=n; j+=i) 
          {
            prime[j] = false;
          }
        }
      }

      for (int i = 4; i <= n; i++) 
      {
        if(prime[i] == false)
        {
          answer++;
        }
      }
      
      return answer;
  }
}