class Solution_Basic14 {
  public int solution(int n, int k) {
      int answer = 12000 * n;
      k -= (int)(n/10);
      answer += k*2000;
      return answer;
  }
}