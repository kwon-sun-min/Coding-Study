public class Main {
    public static void main(String[] args) {
        Solution42 sol = new Solution42();

        int[] input1 = {3, 76, 24};
        int[] output1 = sol.solution(input1);
        for (int i = 0; i < output1.length; i++) 
        {
            System.out.println(output1[i]);
        }

        System.out.println();

        int[] input2 = {1, 2, 3, 4, 5, 6, 7};
        int[] output2 = sol.solution(input2);
        for (int i = 0; i < output2.length; i++) 
        {
            System.out.println(output2[i]);
        }

        System.out.println();

        int[] input3 = {30, 10, 23, 6, 100};
        int[] output3 = sol.solution(input3);
        for (int i = 0; i < output3.length; i++) 
        {
            System.out.println(output3[i]);
        }



    }
}