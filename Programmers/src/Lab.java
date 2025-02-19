import java.util.Comparator;
import java.util.PriorityQueue;

class Lab
{
    public static void main(String[] args) 
    {
        class Process
        {
            int num;
            int workTime;
            int askTime;

            public Process(int num, int worktime, int asktime)
            {
                this.num = num;
                this.workTime = worktime;
                this.askTime = asktime;            
            }

            @Override
            public String toString()
            {
                return "Proess " + num + " workTime : " + workTime + " askTime : " + askTime;
            }
        }
        
        Process p1 = new Process(0, 3, 0);
        Process p2 = new Process(1, 9, 1);
        Process p3 = new Process(2, 5, 3);

        PriorityQueue<Process> queue = new PriorityQueue<>(
            Comparator.comparingInt((Process p) -> p.workTime)
            .thenComparing(p -> p.askTime)
            .thenComparing(p -> p.num)
            );  //workTime  -->  askTime  ---> num
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll().toString());
        }




    }

    
}