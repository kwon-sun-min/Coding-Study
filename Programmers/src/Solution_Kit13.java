import java.util.Arrays;

class TempSolution2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) 
        {
            int[] tempList = new int[(commands[i][1] - commands[i][0]) + 1];
            int index = (commands[i][0] - 1);


            for (int j = 0; j < tempList.length; j++) 
            {
                tempList[j] = array[index++];
            }

            Arrays.sort(tempList);

            answer[i] = tempList[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) 
    {
        TempSolution2 sol = new TempSolution2();
        System.out.println(Arrays.toString(sol.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
        
    }
}