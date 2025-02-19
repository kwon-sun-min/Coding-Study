import java.util.LinkedList;

class Solution57 {
  public LinkedList<Integer> solution(int n) {
      LinkedList<Integer> answer = new LinkedList<Integer>();

      for (int i = 2; i <= n; i++) 
      {
        if(isPrime(i) && n%i==0)
        {
          answer.add(i);
        }
        
        while(isPrime(i) && n%i==0)
        {
          n /= i;
        }

        
      }
      return answer;
  }


  public Boolean isPrime(int n){
    for (int i = 2; i <= Math.sqrt(n); i++) 
    { 
      if(n%i == 0)
      {
        return false;
      }
    }

    return true;
  }

}

