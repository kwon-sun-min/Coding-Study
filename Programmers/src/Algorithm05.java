import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm05 
{
  public static String Solution01(String input)
  {
    String answer = "";
    int l = 0;
    int r = input.length()-1;
    char[] list = input.toCharArray();
    

    while(l < r)
    {
      while(!Character.isAlphabetic(list[l])  &&  l < list.length)
      {
        l++;
      }

      while(!Character.isAlphabetic(list[r])  &&  r > 0)
      {
        r--;
      }

      list[l] = list[r];
      list[r] = input.charAt(l);

      l++;
      r--;
    }

    answer = String.valueOf(list);

    return answer;
  }

  public static String Solution02(String input)
  {
    String answer = "";
    int l = 0;
    int r = input.length()-1;
    char[] list = input.toCharArray();
    

    while(l < r)
    {
      if(!Character.isAlphabetic(list[l]))
      {
        l++;
      }

      else if(!Character.isAlphabetic(list[r]))
      {
        r--;
      }

      else
      {
        list[l] = list[r];
        list[r] = input.charAt(l);

        l++;
        r--;
      }
    }

    answer = String.valueOf(list);

    return answer;
  }

  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    System.out.println(Solution02(kb.next()));
  }
  
}
