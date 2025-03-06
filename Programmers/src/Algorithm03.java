import java.util.Arrays;
import java.util.Scanner;

public class Algorithm03 
{
  public static String solution01(String input)
  {
    String answer = "";
    String[] list = input.split(" ");

    for(String x : list)
    {
      if(answer.length() < x.length())
      {
        answer = x;
      }
    }

    return answer;
  }


  public static String solution02(String input)
  {
    String answer = "";
    int pos;
    

    while((pos = input.indexOf(" ")) != -1)
    {
      if(answer.length() < pos)
      {
        answer = input.substring(0, pos);
      }

      input = input.substring(pos+1);

    }

    if(answer.length() < input.length())
    {
      return input;
    }

    return answer;
  }

  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    String input = kb.nextLine();

    System.out.println(solution02(input));
    
  }
  
}


/*
3. 문장 속 단어
https://cote.inflearn.com/contest/10/problem/01-03
 */