import java.util.Arrays;

class Lab
{
    public static void main(String[] args) 
    {
        int answer = 0;
        int[] citations = {3, 0, 6, 1, 5};
        Arrays.sort(citations);

        for (int i = 0; i <= 1000; i++) 
        {
            int[] temp = Arrays.copyOf(citations, citations.length+1);
            temp[temp.length-1] = i;
            Arrays.sort(temp);

            for (int j = 0; j < temp.length; j++) 
            {
                if(temp[j] == i)
                {
                    int left = j;
                    int right = citations.length-left;

                    if(right == i)
                    {
                        answer = i;
                    }
                }
            }


        }

        System.out.println(answer);


        

        
    }

    
}