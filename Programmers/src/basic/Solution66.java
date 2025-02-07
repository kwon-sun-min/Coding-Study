import java.util.LinkedList;

class Solution66 {
  public LinkedList<Integer> solution(int n, int[] numlist) {
      LinkedList<Integer> answer = new LinkedList<Integer>();
      
      for (int i = 0; i < numlist.length; i++) 
      {
        if(numlist[i]%n==0)
        {
          answer.add(numlist[i]);
        }
        
      }

      return answer;
  }
}