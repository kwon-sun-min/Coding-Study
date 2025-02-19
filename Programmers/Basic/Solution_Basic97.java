class Solution_Basic97 {
    public int solution(int chicken) {
        int service = 0;
        int coupon = 0;
        for (int i = 0; i < chicken; i++) 
        {
            coupon += 1;
            if(coupon % 10 == 0)
            {
                coupon += 1;
                service += 1;
            }
            
        }
        return service;
    }

    public static void main(String[] args) 
    {
        Solution_Basic97 sol = new Solution_Basic97();
        System.out.println(sol.solution(1081));
    }
}