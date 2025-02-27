import java.util.Arrays;

class Lab
{
    static void permutation(int[] arr, int depth, int n, int r)
    {
        if(depth == r)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = depth; i < n; i++) 
        {
            swap(arr, depth, i);
            permutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i)
    {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }


    public static void main(String[] args) 
    {
        permutation(new int[] {1,2,3}, 0, 3, 3);
    }
}