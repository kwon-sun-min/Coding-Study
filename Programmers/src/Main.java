public class Main {
    public static void main(String[] args) {
        Solution27 sol = new Solution27();

        int[] input1 = {1, 2, 3, 4, 5};
        int[] output1 = sol.solution(input1);

        for (int i = 0; i < output1.length; i++) 
        {
            System.out.println(output1[i]);
        }

        
        int[] input2 = {1, 2, 100, -99, 1, 2, 3};
        int[] output2 = sol.solution(input2);

        for (int i = 0; i < output2.length; i++) 
        {
            System.out.println(output2[i]);
        }
    }
}