import java.util.LinkedList;
import java.util.Scanner;

public class Algorithm04 
{

  public static String[] Solution01(String[] words)
  {
    String[] answer = new String[words.length];
    
    for (int i = 0; i < words.length; i++) 
    {
      String reversedWord = "";

      for (int j = 0; j < words[i].length(); j++) 
      {
        reversedWord += words[i].charAt(words[i].length() - 1 - j);
      }

      answer[i] = reversedWord;

    }

    return answer;
  }

  public static LinkedList<String> Solution02(String[] words)
  {
    LinkedList<String> answer = new LinkedList<>();
    
    for(String word : words)
    {
      String x = new StringBuilder(word).reverse().toString();
      answer.add(x);
    }

    return answer;
  }

  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String[] words = new String[n];
    
    for (int i = 0; i < n; i++) 
    {
      words[i] = kb.next();
    }

    for(String answer : Solution02(words))
    {
      System.out.println(answer);
    }
  }
  
}


/*
4. 단어 뒤집기
https://cote.inflearn.com/contest/10/problem/01-04
 */
