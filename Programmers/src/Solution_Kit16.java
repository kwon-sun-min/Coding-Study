import java.util.Arrays;

public class Solution_Kit16 {
    public int solution(int[] citations)
    {
        int answer = -1;

        for (int i = 0; i <= 1000; i++) 
        {
            int[] temp = Arrays.copyOf(citations, citations.length+1);
            temp[temp.length-1] = i;
            Arrays.sort(temp);

            for (int j = 0; j < temp.length; j++) 
            {

                if(temp[j] == i)
                {
                    if(citations.length-j == i)
                    {
                        return i;
                    }
                }
                
            }
        }

        return answer;

    }
    public static void main(String[] args) 
    {
        int[] input1 = {0,1,2,3,4,5,6,7,8,9,10,11,22,33};
        Solution_Kit16 sol = new Solution_Kit16();
        System.out.println(sol.solution(input1));
        
    }
}
