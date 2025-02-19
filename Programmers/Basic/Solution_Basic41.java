public class Solution_Basic41 {
  public String solution(int age) {
      String answer = "";
      String temp = "";
      String[] alphaTable =  {"a", "b","c", "d", "e", "f", "g", "h", "i", "j"};

      while(age > 0)
      {
        temp = alphaTable[age%10];
        answer = temp + answer;
        age /= 10;
      }

      return answer;
  }
}
