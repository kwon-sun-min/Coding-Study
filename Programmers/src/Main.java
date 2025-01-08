import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution57 sol = new Solution57();
        LinkedList<Integer> output1 = sol.solution(10000);
        System.out.println(output1.toString());
        System.out.println(sol.solution(420).toString());
    }
}