import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution71 sol = new Solution71();

        int[] input1 = {1,8,3};
        int[] input2 = {9, 10, 11, 8};

        System.out.println(Arrays.toString(sol.solution(input1)));
        System.out.println(Arrays.toString(sol.solution(input2)));

    }
}