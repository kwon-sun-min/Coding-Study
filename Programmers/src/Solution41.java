public class Solution41 {
  public String solution(int age) {
      String answer = "";
      String temp = "";
      String[] alphaTable =  {"a", "b","c", "d", "e", "f", "g", "h", "i", "j"};
      String[] numTable = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

      while(age > 0)
      {
        temp = alphaTable[age%10];
        answer = temp + answer;
        age /= 10;
      }



      return answer;
  }
}
