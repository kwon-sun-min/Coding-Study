import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution04 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();


        for (int i = 0; i < clothes.length; i++) 
        {
            set.add(clothes[i][1]);
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }

        List<String> sort = new ArrayList<>(set);

        for (int i = 0; i < sort.size(); i++) 
        {
            answer *= (map.get(sort.get(i))+1);
        }




        return (answer-1);
    }

    public static void main(String[] args) {
        String[][] data = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Solution04 sol = new Solution04();
        //sol.solution(data);
        System.out.println(sol.solution(data));
    }
}