class Solution_Basic11 {
  public double solution(int[] numbers) {
      double answer = 0;
      for(int number:numbers){answer += number;}
      answer = answer / numbers.length;
      return answer;
  }
}