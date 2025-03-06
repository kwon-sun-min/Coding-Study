import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution_Kit05 {
    static class Song
    {
        int id;
        int playCount;

        public Song(int id, int playCount)
        {
            this.id = id;
            this.playCount = playCount;
        }
    }


    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> genre_count = new HashMap<>();
        HashMap<String, List<Song>> genre_song = new HashMap<>();

        for (int i = 0; i < genres.length; i++) 
        {
            genre_count.put(genres[i], genre_count.getOrDefault(genres[i], 0) + plays[i]);
        }

        for (int i = 0; i < genres.length; i++) 
        {
            genre_song.putIfAbsent(genres[i], new ArrayList<>());
            genre_song.get(genres[i]).add(new Song(i, plays[i]));
        }

        List<String> sortedGenres = new ArrayList<>(genre_count.keySet());
        Collections.sort(sortedGenres, (a, b) -> genre_count.get(b) - genre_count.get(a));

        List<Integer> bestAlbum = new ArrayList<>();

        for (String genre : sortedGenres) {
            List<Song> songs = genre_song.get(genre);

            songs.sort((a, b) -> {
                if (a.playCount == b.playCount) {
                    return a.id - b.id;  // 고유 번호 오름차순
                } else {
                    return b.playCount - a.playCount;  // 재생 횟수 내림차순
                }
            });

            bestAlbum.add(songs.get(0).id);
            if (songs.size() > 1) {
                bestAlbum.add(songs.get(1).id);
            }
        }

        // 7. 결과를 int 배열로 변환하여 반환
        return bestAlbum.stream().mapToInt(i -> i).toArray();
    }

}