import java.util.Scanner;

public class Algorithm02 
{

  public static String solution01(String input)
  {
    String answer = "";

    for (int i = 0; i < input.length(); i++) 
    {

      if(65 <= (int)input.charAt(i) && (int)input.charAt(i) <= 90)
      {
        answer += Character.toLowerCase(input.charAt(i));
      }

      else
      {
        answer += Character.toUpperCase(input.charAt(i));
      }
      
    }
    return answer;
  }

  public static String solution02(String input)
  {
    String answer = "";

    for(char x : input.toCharArray())
    {

      if(Character.isLowerCase(x))
      {
        answer += Character.toUpperCase(x);
      }

      else
      {
        answer += Character.toLowerCase(x);
      }

    }
    return answer;
  }


  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    String input = kb.next();
    System.out.println(solution01(input));
    System.out.println(solution02(input));

  }
  
}

/*
2. 대소문자 변환
https://cote.inflearn.com/contest/10/problem/01-02
 */
