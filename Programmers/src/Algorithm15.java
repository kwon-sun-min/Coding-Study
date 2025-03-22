import java.util.Scanner;

public class Algorithm15 
{
  public static char Solution01(int A, int B)
  {
    if(A == B)
    {
      return 'D';
    }

    else if((A==1 && B==3)  ||  (A==2 && B==1)  ||  (A==3 && B==2))
    {
      return 'A';
    }

    else
    {
      return 'B';
    }
  }


  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);

    int num = kb.nextInt();
    int[] Adata = new int[num];
    int[] Bdata = new int[num];


    for (int i = 0; i < num; i++) 
    {
      Adata[i] = kb.nextInt();
    }

    for (int i = 0; i < num; i++) 
    {
      Bdata[i] = kb.nextInt();
    }    

    for (int i = 0; i < num; i++) 
    {
      System.out.println(Solution01(Adata[i], Bdata[i]));
    }

  }
}

/*
15. 가위바위보
https://cote.inflearn.com/contest/10/problem/02-03
 */
