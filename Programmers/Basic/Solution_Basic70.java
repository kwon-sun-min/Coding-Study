import java.util.LinkedList;

class Solution_Basic70 {
  public LinkedList<Integer> solution(int n) {
      LinkedList<Integer> answer = new LinkedList<Integer>();
      for (int i = 1; i <= n; i++) 
      {
        if(n%i == 0)
        {
          answer.add(i);
        }
        
      }
      return answer;
  }
}