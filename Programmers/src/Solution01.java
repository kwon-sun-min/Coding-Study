import java.util.HashSet;

class Solution01 {
    public int solution(int[] nums) {
        int kind = 0;
        int option = nums.length/2;
        int[] kinds = new int[200001];

        for (int i = 0; i < nums.length; i++) 
        {
            kinds[nums[i]] = 1;
        }
        
        for (int i = 0; i < kinds.length; i++) 
        {
            if(kinds[i] == 1)
            {
                kind += 1;
            }
        }

        if(option > kind)
        {
            return kind;
        }

        else
        {
            return option;
        }
        
    }
        }
        
    }

    class Solution012 {
    public int solution(int[] nums)
    {
        int option = nums.length/2;

        HashSet<Integer> list = new HashSet<>();
        for(int num : nums)
        {
            list.add(num);
        }

        int kind = list.size();

        if(option > kind)
        {
            return kind;
        }

        else
        {
            return option;
        }
    }

}

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        Solution01 sol = new Solution01();
        System.out.println(sol.solution(nums));
    }
}