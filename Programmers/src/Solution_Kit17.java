public class Solution_Kit17 
{
  public static int[] swap(int[] card)
  {
    if(card[0] < card[1])
    {
      return card;
    }

    else
    {
      card = new int[] {card[1], card[0]};
      return card;
    }
    
  }


  public int solution(int[][] sizes)
  {
    int width = 0;
    int height = 0;

    for (int i = 0; i < sizes.length; i++) 
    {
      sizes[i] = swap(sizes[i]);
      if(width < sizes[i][0])
      {
        width = sizes[i][0];
      }

      if(height < sizes[i][1])
      {
        height = sizes[i][1];
      }
    }

    return width * height;
  }

  public static void main(String[] args) {
    Solution_Kit17 sol = new Solution_Kit17();
    int[][] input1 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
    System.out.println(sol.solution(input1));
  }
  
}
