import java.util.Scanner;

public class Algorithm01 
{

  public static int solution01(String input1, char input2)
  {
    int answer = 0;

    for (int i = 0; i < input1.length(); i++) 
    {
      if(Character.toUpperCase(input1.charAt(i)) == Character.toUpperCase(input2))
      {
        answer++;
      }
      
    }
    return answer;
  }


  public static int solution02(String input1, char input2)
  {
    int answer = 0;
    
    for(char x : input1.toCharArray())
    {
      if(Character.toUpperCase(x) == Character.toUpperCase(input2))
      {
        answer++;
      }

    }
    return answer;
  }

  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    String input1 = in.next();
    char input2 = in.next().charAt(0);

    System.out.println(solution01(input1, input2));
    System.out.println(solution02(input1, input2));

  }
  
}
