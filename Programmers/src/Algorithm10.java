import java.util.Scanner;

public class Algorithm10 
{
  public static int[] Solution01(String input, String e)
  {
    int[] answer = new int[input.length()];
    StringBuilder input2 = new StringBuilder(input);

    for (int i = 0; i < answer.length; i++) 
    {
      answer[i] = 100;
    }


    while(input2.indexOf(e) != -1)
    {
      for (int i = 0; i < answer.length; i++) 
      {
        if(answer[i] > Math.abs(i - input2.indexOf(e)))
        {
          answer[i] = Math.abs(i - input2.indexOf(e));
        }
      }
      input2.setCharAt(input2.indexOf(e), ' ');
    }
    return answer;
  }

  public static int[] Solution02(String input, char e)
  {
    int[] answer = new int[input.length()];
    int p = 100;
    for (int i = 0; i < answer.length; i++) 
    {
      if(input.charAt(i) == e)
      {
        p = 0;
        answer[i] = p;
      }

      else
      {
        p++;
        answer[i] = p;
      }
    }

    for (int i = answer.length-1; i >= 0; i--) 
    {
      if(input.charAt(i) == e)
      {
        p = 0;
      }

      else
      {
        p++;
        answer[i] = Math.min(answer[i], p);
      }
      
    }

    return answer;
  }

  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    String input = kb.next();
    //String e = kb.next();

    // for(int i : Solution01(input, e))
    // {
    //   System.out.print(i + " ");
    // } 

    char e1 = kb.next().charAt(0);
    for(int i : Solution02(input, e1))
    {
      System.out.print(i + " ");
    } 
  }
}
/*
10. 가장 짧은 문자거리
https://cote.inflearn.com/contest/10/problem/01-10
 */


