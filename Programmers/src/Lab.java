import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Lab
{
    public static void main(String[] args) 
    {
        int[] numbers = {3, 30, 34, 5, 9, 0};
        String answer = "";

        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < numbers.length; i++) 
        {
            String num = Integer.toString(numbers[i]);

            if(num.length() < 4)
            {
                for (int j = 0; j < 4 - Integer.toString(numbers[i]).length(); j++) 
                {
                    num += "#";
                }
            }

            num = num.replace("0", "!");
            list.add(num);
        }

        while(!list.isEmpty())
        {
            String max = "!###";

            for (int i = 0; i < list.size(); i++) 
            {
                if(max.compareTo(list.get(i)) < 0)
                {
                    max = list.get(i);
                }
            }

            answer += max;
            list.remove(max);
        }


        System.out.println(list);
        answer = answer.replace("!", "0");
        answer = answer.replace("#", "");

        System.out.println(answer);

        

        
    }

    
}