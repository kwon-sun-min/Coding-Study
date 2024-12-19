public class Main {
    public static void main(String[] args) {
        Solution33 sol = new Solution33();


        for (int i = 0; i < (int)Math.ceil(10/2.0); i++) 
        {
            System.out.println(sol.solution(10)[i]);
        }

        System.out.println();

        for (int i = 0; i < (int)Math.ceil(15/2.0); i++) 
        {
            System.out.println(sol.solution(15)[i]);
        }


    }
}