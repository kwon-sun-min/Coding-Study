class Solution46 {
  public int solution(int balls, int share) {
      long result = 1; // 중간 계산을 long으로 처리

      for (int i = 0; i < share; i++) {
          result = result * (balls - i) / (i + 1);
      }

      return (int) result; // 최종 결과를 int로 변환하여 반환
  }
}
