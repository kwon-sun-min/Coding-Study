import java.util.Arrays;
import java.util.HashMap;

class Solution05 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> genres_view = new HashMap<>();
        HashMap<Integer, Integer> Num_songs = new HashMap<>();

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};


        for (int i = 0; i < genres.length; i++) 
        {
            genres_view.put(genres[i], genres_view.getOrDefault(genres[i], 0) + plays[i]);
        }


        for (int i = 0; i < plays.length; i++) 
        {
            Num_songs.put(i, plays[i]);
        }


        int[] views = new int[genres_view.size()];
        int index = 0;

        for(int view : genres_view.values())
        {
            views[index++] = view;
        }
        Arrays.sort(views);



        for(String gene : genres_view.keySet())
        {
            for (int i = 0; i < views.length; i++) 
            {
                if(genres_view.get(gene) == views[i])
                {
                    
                }
                
            }
        }












        


            


    }
}