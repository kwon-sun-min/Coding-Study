import java.util.Arrays;

public class Solution_Kit16 {
    public int solution(int[] citations)
    {

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) 
        {
            int h = citations.length - i;
            if(citations[i] >= h)
            {
                return h;
            }

        }

        return 0;

    }
    public static void main(String[] args) 
    {
        int[] input1 = {0,1,2,3,4,5,6,7,8,9,10,11,22,33};
        Solution_Kit16 sol = new Solution_Kit16();
        System.out.println(sol.solution(input1));
        
    }
}
