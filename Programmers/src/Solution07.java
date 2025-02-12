import java.util.ArrayList;
import java.util.Arrays;

class Solution07 {
  public int[] solution(int[] progresses, int[] speeds) {
      int[] time = new int[progresses.length];
      ArrayList<Integer> list = new ArrayList<>();
     
      int index = 1;

      for (int i = 0; i < progresses.length; i++) 
      {
        time[i] = (int)(Math.ceil((100 - progresses[i])/(double)speeds[i]));
      }
//
      for (int i = 1; i < time.length; i++) 
      {
        if(time[i-1] < time[i])
        {
          list.add(index);
          index = 1;
        }

        else
        {
          ++index;
        }
      }

      list.add(index);
      

      int[] answer = new int[list.size()];
      for (int i = 0; i < list.size(); i++) 
      {
        answer[i] = list.get(i);
      }

      

      return answer;
  }

  public static void main(String[] args) {
    int[] progresses = {85, 80, 90, 85};
    int[] speeds = {5, 5, 5, 5};
    Solution07 sol = new Solution07();
    System.out.println(Arrays.toString(sol.solution(progresses, speeds)));
  }
}