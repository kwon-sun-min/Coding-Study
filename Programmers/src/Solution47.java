class Solution47 {
  public int[][] solution(int[] num_list, int n) {
      int[][] answer = new int[num_list.length/n][n];
      int count = 0;

      for (int i = 0; i < num_list.length; i+=n) 
      {
        int[] temp = new int[n];

        for (int j = 0; j < n; j++) 
        {
          temp[j] = num_list[i+j];
        }

        answer[count++] = temp;
      }
      return answer;
  }
}