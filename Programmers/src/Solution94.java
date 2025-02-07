class Solution94 {
    public int solution(int[] common) {
        boolean multiple = true;
        int d = 0;
        if(common[0] + common[2] == common[1]*2)
        {
            multiple = false;
        }

        if(multiple)
        {
            d = common[1] / common[0];
            return common[common.length-1] * d;
        }

        else
        {
            d = common[1] - common[0];
            return common[common.length-1] + d;
        }
        
    }

    public static void main(String[] args) {
        Solution94 sol = new Solution94();
        int[] input1 = {4, 16, 64};
        int[] input2 = {1,2,3,4};
        System.out.println(sol.solution(input1));
        System.out.println(sol.solution(input2));
    }
}