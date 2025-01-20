class Solution73 {
  public int solution(int num, int k) {
      int answer = -1;
      String Stringnum = Integer.toString(num);

      for (int i = 0; i < Stringnum.length(); i++) 
      {
        if(Stringnum.charAt(i) == (Integer.toString(k)).charAt(0))
        {
          answer = i+1;
          break;
        }

      }
      return answer;
  }

  public static void main(String[] args) {
    int a = 1;
    System.out.println((Integer.toString(a)).getClass());
  }

}