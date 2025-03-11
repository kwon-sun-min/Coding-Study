import java.util.Scanner;

public class Algorithm08 
{
    public static String Solution01(String input)
    {
        input = input.toLowerCase();
        
        int r = 0;
        int l = input.length()-1;

        while(r < l)
        {
            if(Character.isAlphabetic(input.charAt(l))  &&  Character.isAlphabetic(input.charAt(r)) &&  (input.charAt(r)  !=  input.charAt(l)))
            {
                return "NO";
            }

            else if(!Character.isAlphabetic(input.charAt(r)))
            {
                r++;
            }

            else if(!Character.isAlphabetic(input.charAt(l)))
            {
                l--;
            }

            else
            {
                r++;
                l--;
            }
            }
        return "YES";
    }

    public static String Solution02(String input)
    {
        input = input.toLowerCase().replaceAll("[^a-z]", "");
        String temp = new StringBuilder(input).reverse().toString();

        if(input.equals(temp))
        {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println(Solution02(kb.nextLine()));
        
    }
    
}
