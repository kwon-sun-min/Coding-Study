public class Solution_Kit22 
{
    static int answer = -1;

    public int solution(int k, int[][] dungeons)
    {
        permutation(dungeons, 0, dungeons.length, k);
        return answer;
    }

    static void permutation(int[][] dungeons, int depth, int n, int k)
    {
        if(depth == n)
        {
            int possible = 0;
            for (int i = 0; i < dungeons.length; i++) 
            {
                if(dungeons[i][0] <= k)
                {
                    possible++;
                    k -= dungeons[i][1];
                }
                
            }

            if(answer < possible)
            {
                answer = possible;
            }
            return;
        }

        for (int i = depth; i < dungeons.length; i++) 
        {
            swap(dungeons, depth, i);
            permutation(dungeons, depth+1, n, k);
            swap(dungeons, depth, i);
        }
    }

    static void swap(int[][]dungeons, int depth, int i)
    {
        int[] temp = dungeons[depth];
        dungeons[depth] = dungeons[i];
        dungeons[i] = temp;
    }

    public static void main(String[] args) 
    {
        Solution_Kit22 sol = new Solution_Kit22();
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(sol.solution(80, dungeons));
        
    }


    
}
