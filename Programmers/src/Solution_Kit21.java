import java.util.Arrays;

public class Solution_Kit21 {
    public int[] solution(int brown, int yellow)
    {
        int[] answer = {};

        int num = brown + yellow;
        int[] line = new int[] {0, 0};

        for (int i = 1; i < num; i++) 
        {
            if(num%i == 0)
            {
                line[0] = i;
                line[1] = num/i;
                if((line[0]-2) * (line[1]-2) == yellow && line[0] >= line[1])
                {
                    return line;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) 
    {
        Solution_Kit21 sol = new Solution_Kit21();

        System.out.println(Arrays.toString(sol.solution(5000, 2000000)));
    }

    
}
