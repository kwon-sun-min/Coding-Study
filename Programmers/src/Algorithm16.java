import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm16 
{
  public static ArrayList<Integer> Solution01(int n)
  {
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(1);
    answer.add(1);

    for (int i = 0; i < n-2; i++) 
    {
      answer.add(answer.get(answer.size()-1) + answer.get(answer.size()-2));
    }

    return answer;
  }

  public static int[] Solution02(int n)
  {
    int[] answer = new int[n];
    answer[0] = 1;
    answer[1] = 1;

    for (int i = 2; i < n; i++) 
    {
      answer[i] = answer[i-1] + answer[i-2];
    }

    return answer;
  }

  

  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    
    for(int x : Solution02(n))
    {
      System.out.print(x + " ");
    }
    
  }
  
}

/*
피보나치 수열
https://cote.inflearn.com/contest/10/problem/02-04
 */