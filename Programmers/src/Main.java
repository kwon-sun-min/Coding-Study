public class Main {
    public static void main(String[] args) {
        Solution23 sol = new Solution23();

        int[] output1 = sol.solution(1,2,3,4);

        for (int i = 0; i < output1.length; i++) 
        {
            System.out.println(output1[i]);
        }


        int[] output2 = sol.solution(9,2,1,3);

        for (int i = 0; i < output2.length; i++) 
        {
            System.out.println(output2[i]);
        }

        

    }
}