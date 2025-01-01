public class Main {
    public static void main(String[] args) {
        Solution49 sol = new Solution49();

        int[] input1 = {1, 2, 3};
        int[] output1 = sol.solution(input1, "right");

        for (int i = 0; i < output1.length; i++) 
        {
            System.out.println(output1[i]);
        }

        int[] input2 = {4, 455, 6, 4, -1, 45, 6};
        int[] output2 = sol.solution(input2, "left");

        for (int i = 0; i < output2.length; i++) 
        {
            System.out.println(output2[i]);
        }
        
    
    }

}