public class Main {
    public static void main(String[] args) {
        Solution25 sol = new Solution25();

        String[] s1= {"a", "b", "c"};
        String[] s2= {"com", "b", "d", "p", "c"};

        int output = sol.solution(s1, s2);
        System.out.println(output);

        String[] s3= {"n", "omg"};
        String[] s4= {"m", "dot"};
        
        System.out.println(sol.solution(s3, s4));

        
    }
}