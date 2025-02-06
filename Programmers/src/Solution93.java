import java.util.Arrays;

class Solution93 {
  public int[] solution(int num, int total) {
      int a = ((2*total/num) - num + 1 ) / 2;
      int[] answer = new int[num];
      for (int i = 0; i < num; i++) 
      {
        answer[i] = a+i;
      }
      return answer;
  }

  public static void main(String[] args) 
  {
    Solution93 sol = new Solution93();
    System.out.println(Arrays.toString(sol.solution(3, 12)));
    System.out.println(Arrays.toString(sol.solution(5, 15)));
    System.out.println(Arrays.toString(sol.solution(4, 14)));
    System.out.println(Arrays.toString(sol.solution(5, 5)));


    
    
  }
}