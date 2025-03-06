import java.util.*;

class Solution_Kit14 {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<int[]> queue = new PriorityQueue<>(
            (a, b) -> a[1] == b[1] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
        );

        int time = 0, index = 0, totalTime = 0, jobCount = jobs.length;

        while (index < jobs.length || !queue.isEmpty()) {
            while (index < jobs.length && jobs[index][0] <= time) {
                queue.add(jobs[index++]);
            }

            if (!queue.isEmpty()) {
                int[] job = queue.poll();
                time += job[1];
                totalTime += time - job[0];
            } else {
                time = jobs[index][0];
            }
        }

        return totalTime / jobCount;
    }
}