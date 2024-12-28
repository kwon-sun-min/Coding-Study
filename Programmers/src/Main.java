import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution47 sol = new Solution47();

        int[] input1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] input2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};

        int[][] output1 = sol.solution(input1, 2);
        int[][] output2 = sol.solution(input2, 3);

        System.out.println(Arrays.deepToString(output1));
        System.out.println(Arrays.deepToString(output2));




    }

}