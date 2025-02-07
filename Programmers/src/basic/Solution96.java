import java.util.Arrays;

class Solution96 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] aver = new int[score.length];

        for (int i = 0; i < aver.length; i++) 
        {
            aver[i] = score[i][0] + score[i][1];
        }

        Arrays.sort(aver);

        for (int i = 0; i < aver.length / 2; i++) 
        {
            int temp = aver[i];
            aver[i] = aver[aver.length - 1 - i];
            aver[aver.length - 1 - i] = temp;
        }

        for (int i = 0; i < score.length; i++) 
        {
            for (int j = 0; j < aver.length; j++) 
            {
                if(score[i][0]+score[i][1] == aver[j])
                {
                    answer[i] = j+1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) 
    {
        Solution96 sol = new Solution96();
        int[][] input1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] input2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(sol.solution(input1)));   
        System.out.println(Arrays.toString(sol.solution(input2)));   

    }
}