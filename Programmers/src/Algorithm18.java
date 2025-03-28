import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithm18 
{
  public static boolean isPrime(int n)
  {
    if(n == 1)
    {
      return false;
    }

    for (int i = 2; i < n; i++) 
    {
      if(n%i == 0)
      {
        return false;
      }
      
    }
    
    return true;
  }

  public static ArrayList<Integer> Solution01(int n, int[] nums)
  {
    ArrayList<Integer> answer = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) 
    {
      int temp = nums[i];
      int res = 0;
      while(temp>0)
      {
        int t = temp%10;
        res = res*10+t;
        temp = temp/10;
      }

      if(isPrime(res))
      {
        answer.add(res);
      }
    }

    return answer;
  }

  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < nums.length; i++) 
    {
      nums[i] = kb.nextInt();
    }

    for(int x : Solution01(n, nums))
    {
      System.out.print(x+" ");
    }  
  }
  
}
