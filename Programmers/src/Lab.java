
class Lab
{
    public static long num(long k, long y)
    {
        return k * y;
    }
    public static void main(String[] args) 
    {
        long n = 200L;
        long m = 50000000000000L;
        n *= m;

        System.out.println(num(5000, 2000000));

        System.out.println(n);



        
    }

    
}