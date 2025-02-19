class Solution46 {
  public int solution(int balls, int share) {
      long result = 1; 

      for (int i = 0; i < share; i++) {
          result = result * (balls - i) / (i + 1);
      }

      return (int) result; 
  }
}
