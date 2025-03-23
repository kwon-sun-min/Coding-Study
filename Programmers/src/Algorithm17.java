import java.util.Scanner;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Algorithm17 
{
  public static int Solution01(int num)
  {
    int answer = 0;
    boolean[] list = new boolean[num+1];
    list[0] = true;
    list[1] = true;

    for (int i = 2; i < list.length; i++) 
    {
      if(list[i] == false)
      {
        for (int j = i*2; j < list.length; j+=i) 
        {
          list[j] = true;
        }
      }
    }

    for (int i = 0; i < list.length; i++) 
    {
      if(list[i] == false)
      {
        answer++;
      }
      
    }

    return answer;
  }

  
  public static int Solution02(int n)
  {
    boolean[] list = new boolean[n];
    int answer = 0;

    for (int i = 2; i < list.length; i++) 
    {
      if(list[i] == false)
      {
        answer++;
        for (int j = i; j < list.length; j+=i) 
        {
          list[j] = true;
        }
      }
      
    }

    return answer;
  }



  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    System.out.println(Solution02(n));
    
  }
  
}

/*
17. 소수(에라토스테네스의 체)
https://cote.inflearn.com/contest/10/problem/02-05
 */
