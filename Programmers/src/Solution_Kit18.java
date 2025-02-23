import java.util.Arrays;

public class Solution_Kit18 {
  public int[] solution(int[] answers)
  {
    int[] sheet1 = {1, 2, 3, 4, 5};
    int[] sheet2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] sheet3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 

    int score1 = 0;
    int score2 = 0;
    int score3 = 0;



    for (int i = 0; i < answers.length; i++) 
    {
      if(sheet1[i%5] == answers[i])
      {
        score1++;
      }

      if(sheet2[i%5] == answers[i])
      {
        score2++;
      }

      if(sheet3[i%5] == answers[i])
      {
        score3++;
      }
    }

    if(score1 > score2 && score1 > score3)
    {
      return new int[] {1};
    }

    else if(score2 > score1 && score2 > score3)
    {
      return new int[] {2};
    }

    else if(score3 > score1 && score3 > score2)
    {
      return new int[] {3};
    }

    else if(score1 > score3 && score1 == score2)
    {
      return new int[] {1,2};
    }

    else if(score3 > score1 && score3 == score2)
    {
      return new int[] {2,3};
    }

    else if(score1 == score3 && score1 > score2)
    {
      return new int[] {1,3};
    }

    else if(score1 == score2 && score2 == score3)
    {
      return new int[] {1, 2, 3};
    }

    else
    {
      return new int[] {};
    }

  }

  public static void main(String[] args) 
  {
    Solution_Kit18 sol = new Solution_Kit18();
    System.out.println(Arrays.toString(sol.solution(new int[] {1,2,3,4,5})));
    System.out.println(Arrays.toString(sol.solution(new int[] {1, 3, 2, 4, 2})));

    
  }
  
}
