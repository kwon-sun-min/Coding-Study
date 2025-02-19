class Solution_Basic79 {
  public int solution(int[][] dots) {
    if(check(dots))
    {
      return 1;
    }
    return 0;


  }

  public boolean check(int[][] dots)
  {
    if((dots[1][0]-dots[0][0])*(dots[3][1]-dots[2][1])  ==  (dots[3][0]-dots[2][0])*(dots[1][1]-dots[0][1])) {return true;}
    if((dots[1][0]-dots[2][0])*(dots[3][1]-dots[0][1])  ==  (dots[3][0]-dots[0][0])*(dots[1][1]-dots[2][1])) {return true;}
    if((dots[1][0]-dots[3][0])*(dots[0][1]-dots[2][1])  ==  (dots[0][0]-dots[2][0])*(dots[1][1]-dots[3][1])) {return true;}



    return false;
  }
}