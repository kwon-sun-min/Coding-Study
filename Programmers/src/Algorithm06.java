import java.util.Scanner;

public class Algorithm06 
{
  public static String Solution01(String input)
  {
    String answer = "";

    for(char x : input.toCharArray())
    {
      if(answer.indexOf(x) == -1)
      {
        answer += x;
      }
    }

    return answer;
  }

  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    System.out.println(Solution01(kb.next()));
    
  }
}

/*
6. 중복 문자 제거
https://cote.inflearn.com/contest/10/problem/01-06
 */
