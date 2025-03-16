import java.util.Scanner;

public class Algorithm11 
{
  public static String Solution01(String input)
  {
    char alpha = input.charAt(0);
    int count = 0;
    String answer = "";

   for (int i = 0; i < input.length(); i++) 
   {
    if(alpha != input.charAt(i))
    {
      answer += alpha;
      if(count != 1)
      {
        answer += Integer.toString(count);
      }
      alpha = input.charAt(i);
      count = 1;
    }

    else
    {
      count++;
    }
  }
  
    answer += alpha;
    if(count != 1)
    {
      answer += Integer.toString(count);
    }
    return answer;
  }

  public static String Solution02(String input)
  {
    input += " ";
    int count = 1;
    String answer = "";

    for (int i = 0; i < input.length()-1; i++) 
    {
      if(input.charAt(i) == input.charAt(i+1))
      {
        count++;
      }

      else
      {
        answer += input.charAt(i);
        if(count > 1)
        {
          answer += Integer.toString(count);
        }
        count = 1;
      }
    }
    return answer;
  }


  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    String input = kb.next();
    System.out.println(Solution02(input));

  }
}

/*
11. 문자열 압축
https://cote.inflearn.com/contest/10/problem/01-11
 */

