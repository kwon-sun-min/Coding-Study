public class Main {
    public static void main(String[] args) {
        Solution66 sol = new Solution66();
        
        int[] input1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] input2 = {1, 9, 3, 10, 13, 5};
        int[] input3 = {2, 100, 120, 600, 12, 12};

        System.out.println(sol.solution(3, input1).toString());
        System.out.println(sol.solution(3, input2).toString());
        System.out.println(sol.solution(3, input3).toString());


    }
}