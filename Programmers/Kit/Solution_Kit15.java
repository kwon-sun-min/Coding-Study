import java.util.Arrays;

class Solution_Kit15 {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]); 
        }

        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        if (strNumbers[0].equals("0")) {
            return "0";
        }

        String answer = "";
        for (String num : strNumbers) {
            answer += num; 
        }

        return answer;
    }
}