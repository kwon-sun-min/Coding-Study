import java.util.LinkedList;

public class Solution_Kit24 
{
  public int solution(int n, int[] lost, int[] reserve)
  {
    LinkedList<Integer> lostList = new LinkedList<>();
    LinkedList<Integer> reserveList = new LinkedList<>();

    for (Integer integer : lost) 
    {
      lostList.add(integer);
    }

    for (Integer integer : reserve) 
    {
      reserveList.add(integer);
    }

    LinkedList<Integer> common = new LinkedList<>(lostList);
    common.retainAll(reserveList);
    lostList.removeAll(common);
    reserveList.removeAll(common);


    for (int i = 1; i <= n; i++) 
    {
      if(lostList.contains(i) && reserveList.contains(i-1))
      {
        reserveList.remove(Integer.valueOf(i-1));
        lostList.remove(Integer.valueOf(i));
      }

      else if(lostList.contains(i) && reserveList.contains(i+1))
      {
        reserveList.remove(Integer.valueOf(i+1));
        lostList.remove(Integer.valueOf(i));
      }
      
    }

    return n - lostList.size();
  }

  public static void main(String[] args) 
  {
    Solution_Kit24 sol = new Solution_Kit24();
    System.out.println(sol.solution(5, new int[] {2,4}, new int[] {3}));
    
  }
  
}
