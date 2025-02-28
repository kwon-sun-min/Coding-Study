import java.util.Arrays;

class Lab
{

    public static void main(String[] args) 
    {
        int[] list = {1, 2, 3, 4, 5};
        int[] list2 = new int[list.length];

        for (int i = 0; i < list.length; i++) 
        {
            list2[i] = list[list.length -1 -i];
        }

        System.out.println(Arrays.toString(list2));
    }
}