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
    
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println(Solution01(kb.nextLine()));
    }

    
}
