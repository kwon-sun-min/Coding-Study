import java.util.Scanner;

public class Algorithm14
{
  public static int Solution01(int num, int[] students)
  {
    int max = 0;
    int answer = 0;

    for (int i = 0; i < num; i++) 
    {
      if(max < students[i])
      {
        answer++;
        max = students[i];
      }
      
    }
    return answer;
  }

  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    int num = kb.nextInt();
    int[] students = new int[num];

    for (int i = 0; i < num; i++) 
    {
      students[i] = kb.nextInt();
    }

    System.out.println(Solution01(num, students));

    
  }
}