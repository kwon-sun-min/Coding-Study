import java.util.Arrays;

class Solution_Basic75 {
  public String solution(String my_string) {
      String answer = "";
      my_string = my_string.toLowerCase();
      String[] list = my_string.split("");
      Arrays.sort(list);
      answer = String.join("", list);
      return answer;
  }
}