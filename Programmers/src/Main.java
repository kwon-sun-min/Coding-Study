import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution54 sol = new Solution54();

        // LinkedList<Integer>를 받아서 문자열로 변환
        LinkedList<Integer> result = sol.solution("hi12392");
        String output = result.stream()
                              .map(String::valueOf) // Integer를 String으로 변환
                              .collect(Collectors.joining(", ")); // ", "로 연결

        System.out.println(output); // 결과 출력
    }
}