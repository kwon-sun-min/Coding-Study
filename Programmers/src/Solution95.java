import java.util.Arrays;

class Solution95 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int temp = 0;
        Arrays.sort(numlist);

        for (int i = 0; i < numlist.length; i++) 
        {
            numlist[i] -= n;
        }

        for (int i = 0; i < numlist.length-1; i++) 
        {
            for (int j = i+1; j < numlist.length; j++) 
            {
                if(Math.abs(numlist[i]) >= Math.abs(numlist[j]))
                {
                    temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) 
        {
            answer[i] = numlist[i] + n;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution95 sol = new Solution95();
        int[] input1 = {1, 6, 3, 4, 5, 2};
        int[] input2 = {10000,20,36,47,40,6,10,7000};
        System.out.println(Arrays.toString(sol.solution(input1, 4)));
        System.out.println(Arrays.toString(sol.solution(input2, 30)));

    }
}