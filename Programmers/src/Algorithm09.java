import java.util.Scanner;

public class Algorithm09 
{
    public static int Solution01(String input)
    {
        String answer = "";
        for(char x : input.toCharArray())
        {
            if(Character.isDigit(x))
            {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static int Solution02(String input)
    {
        int answer = 0;
        for(char x : input.toCharArray())
        {
            if(x >= 48  &&  x <= 57 )
            {
                answer = answer * 10 + (x-48);
            }
        }

        return answer;
    }
    
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println(Solution02(kb.nextLine()));
    }
}

/*
9. 숫자만 추출
https://cote.inflearn.com/contest/10/problem/01-09
 */
