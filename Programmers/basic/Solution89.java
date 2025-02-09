import java.util.Arrays;

class Solution89 {
  public int solution(int[] sides) {
      int answer = 0;
      Arrays.sort(sides);
      
      int bigNum = sides[1];
      int xNum = (bigNum - sides[0]) + 1;

      while(bigNum >= xNum  &&  bigNum < xNum + sides[0])
      {
        xNum++;
        answer++;
      }

      while(xNum < bigNum + sides[0])
      {
        xNum++;
        answer++;
      }
      
      return answer;
  }

  public static void main(String[] args) {
    int[] list = {1, 2};
    Solution89 sol = new Solution89();
    System.out.println(sol.solution(list));
  }
}