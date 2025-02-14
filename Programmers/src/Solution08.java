import java.util.Stack;

class Solution08 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) == '(')
            {
                stack.add(s.charAt(i));
            }

            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }

                else
                {
                    return false;
                }
            }
        }

        if(!stack.isEmpty())
        {
            return false;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution08 sol = new Solution08();
        System.out.println(sol.solution("()()"));
        System.out.println(sol.solution("(())()"));
        System.out.println(sol.solution("()("));
        System.out.println(sol.solution("())"));




    }
}