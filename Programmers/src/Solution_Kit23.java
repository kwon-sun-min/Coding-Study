import java.util.Arrays;

public class Solution_Kit23 
{
  public int solution(int[] people, int limit)
  {
    Arrays.sort(people);

    int left = 0;
    int right = people.length-1;
    int answer = 0;

    while(left <= right)
    {
      if(limit >= people[left] + people[right])
      {
        left++;
      }

      right--;
      answer++;
    }

    return answer;
  }
  
}
