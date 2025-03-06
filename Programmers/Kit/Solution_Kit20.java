import java.util.Arrays;

public class Solution_Kit20 
{
  public int solution(String numbers)
  {
    int answer = 0;
    

    boolean[] isPrime = new boolean[(int)Math.pow(10, numbers.length())];
    int n = isPrime.length-1;

    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;

    for (int i = 2; i*i <= n; i++) 
    {
      if(isPrime[i])
      {
        for (int j = i*i; j <= n; j+=i) 
        {
          isPrime[j] = false;
        }
      }
    }

    for (int i = 0; i <= n; i++) 
    {
      if(isPrime[i])
      {
        String prime = Integer.toString(i);

        for (int j = 0; j < numbers.length(); j++) 
        {
          prime = prime.replaceFirst(Character.toString(numbers.charAt(j)), ".");
        }

        if(prime.replace(".", "").isEmpty())
        {
          answer++;
        }


      }
      
    }
    return answer;
  }

  public static void main(String[] args) 
  {
    Solution_Kit20 sol = new Solution_Kit20();

    System.out.println(sol.solution("011"));
    
  }
  
}
