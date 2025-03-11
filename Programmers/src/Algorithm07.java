import java.util.Scanner;

public class Algorithm07 
{
    public static String Solution01(String input)
    {
        int r = 0;
        int l = input.length()-1;
        input = input.toLowerCase();

        while(r < l)
        {
            if(input.charAt(r) == input.charAt(l))
            {
                r++;
                l--;
                continue;
            }

            else
            {
                return "NO";
            }
        }

        return "YES";
    }

    public static String Solution02(String input)
    {
        String temp = new StringBuilder(input).reverse().toString();
        if(input.equalsIgnoreCase(temp))
        {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println(Solution02(kb.next()));
        
    }

    
}
