import java.util.Arrays;
import java.util.HashSet;

class Solution_Kit03 {
    public boolean solution(String[] phone_book) {

        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));

        for(String phone : phone_book)
        {
            for (int i = 1; i < phone.length(); i++) 
            {
                if(set.contains(phone.substring(0, i)))
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {
        Solution_Kit03 sol = new Solution_Kit03();
        String[] phonenums = {"119", "97674223", "1195524421"};
        String[] phonenums2 = {"123","456","789"};
        String[] phonenums3 = {"12","123","1235","567","88"};
        System.out.println(sol.solution(phonenums));
        System.out.println(sol.solution(phonenums2));
        System.out.println(sol.solution(phonenums3));


        
    }
}