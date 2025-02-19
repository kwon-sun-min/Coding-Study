class Solution_Basic86 {
  public String solution(String polynomial) {

      int xNum = 0;
      int Num = 0;

      String[] polyList = polynomial.split(" ");

      for (int i = 0; i < polyList.length; i++) 
      {
        if(polyList[i].equals("x"))
        {
          polyList[i] = "1x";
        }

        if(polyList[i].endsWith("x"))
        {
          xNum += Integer.parseInt(polyList[i].substring(0, polyList[i].length()-1));
        }

        else if(!polyList[i].equals("+"))
        {
          Num += Integer.parseInt(polyList[i]);
        }
      }

      String answer = "";

      if(xNum > 1)
      {
        answer += xNum + "x";

        if(Num > 0)
        {
          answer += " + " + Num;
        }

        else if(Num == 0)
        {
          answer += "";
        }

        else
        {
          answer += " - " + Math.abs(Num);
        }
      }

      else if(xNum == 1)
      {
        answer = "x";

        if(Num > 0)
        {
          answer += " + " + Num;
        }

        else if(Num == 0)
        {
          answer += "";
        }

        else
        {
          answer += " - " + Math.abs(Num);
        }
      }

      else
      {
        answer = "";

        if(Num == 0)
        {
          answer += 0;
        }

        else
        {
          answer += Num;
        }
      }

      
      return answer;
  }
}