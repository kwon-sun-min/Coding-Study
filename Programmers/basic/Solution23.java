class Solution23 {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
      int[] answer = new int[2];

      int ans_number = numer1 * denom2 + numer2 * denom1;
      int ans_demon = denom1 * denom2;

      int gcd = getGCD(ans_number, ans_demon);

      answer[0] = ans_number / gcd;
      answer[1] = ans_demon / gcd;

      return answer;
  }

  public int getGCD(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
  }
}
