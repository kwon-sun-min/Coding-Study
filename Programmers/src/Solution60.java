class Solution60 {
  public int solution60(int[] array, int height) {
      int answer = 0;
      for (int i = 0; i < array.length; i++) 
      {
        if(array[i] > height)
        {
          answer++;
        }
        
      }
      return answer;
  }
  public static void main(String[] args) {
    Solution60 sol = new Solution60();

    int[] input1 = {180, 120, 140};
    System.out.println(sol.solution60(input1, 190));

  }
}

