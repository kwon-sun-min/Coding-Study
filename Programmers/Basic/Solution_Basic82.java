import java.util.Arrays;

class Solution_Basic82 {
  public int solution(String before, String after) {
    char[] beforeArray = before.toCharArray();
    char[] afterArray = after.toCharArray();

    Arrays.sort(beforeArray);
    Arrays.sort(afterArray);

    return Arrays.equals(beforeArray, afterArray) ? 1:0;
  }
}