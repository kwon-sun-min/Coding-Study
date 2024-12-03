public class Main {
    public static void main(String[] args) {
        Solution17 sol = new Solution17();

        int[] input1 = {1,2};
        int[] input2 = {-1,2};
        int[] input3 = {-1,-2};
        int[] input4 = {1,-2};

        System.out.println(sol.solution(input1));
        System.out.println(sol.solution(input2));
        System.out.println(sol.solution(input3));
        System.out.println(sol.solution(input4));        
    }
}