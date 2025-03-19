import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm13 
{
    public static ArrayList<Integer> Solution(int num, int[] list)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(list[0]);
        
        for (int i = 1; i < list.length; i++) 
        {
            if(list[i-1] < list[i])
            {
                answer.add(list[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] list = new int[num];
        
        for (int i = 0; i < list.length; i++) 
        {
            list[i] = kb.nextInt();
        }

        for(int x : Solution(num, list))
        {
            System.out.print(x + " ");
        }


    }    
}

/*
13. 큰 수 출력하기
https://cote.inflearn.com/contest/10/problem/02-01
 */


