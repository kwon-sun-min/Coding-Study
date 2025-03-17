import java.util.Scanner;

public class Algorithm12 
{
    public static String Solution01(String input)
    {
        String answer = "";
        String line = "";

        for (int i = 0; i < input.length(); i++) 
        {
            line += input.charAt(i);

            if(line.length() == 7)
            {
                String Bin = "";
                for(char x : line.toCharArray())
                {
                    if(x == '#')
                    {
                        Bin += '1';
                    }

                    else
                    {
                        Bin += '0';
                    }
                }

                answer += (char)Integer.parseInt(Bin, 2);
                line = "";
            }
        }
        return answer;
    }

    public static String Solution02(int num, String input)
    {
        String answer = "";
        for (int i = 0; i < num; i++) 
        {
            String temp = input.substring(0, 7).replace('#', '1').replace('*', '0');
            answer += (char)Integer.parseInt(temp, 2);
            input = input.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String input = kb.next();
        System.out.println(Solution02(num, input));
    }
    
}

/*
12. 암호
https://cote.inflearn.com/contest/10/problem/01-12
 */