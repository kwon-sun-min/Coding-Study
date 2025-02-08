class Solution98 {
    public int solution(String A, String B) {
        int answer = -1;

        if(A.equals(B))
        {
            return 0;
        }

        for (int i = 1; i <= A.length(); i++) 
        {
            char last = A.charAt(A.length()-1);
            String remind = A.substring(0, A.length()-1);
            A = last + remind;

;            if(A.equals(B))
            {
                return i;
            }

            
        }
        
        return answer;
    }

    public static void main(String[] args) 
    {
        Solution98 sol = new Solution98();
        System.out.println(sol.solution("hello", "llohe"));
        String temp = "hello";
        temp = temp.charAt(temp.length()-1)+temp;
        System.out.println(temp);

    }
}