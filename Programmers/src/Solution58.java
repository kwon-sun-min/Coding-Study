class Solution58 {
  public int solution(String s) {
      int answer = 0;
      String[] list = s.split(" ");
      
      for (int i = 0; i < list.length; i++) 
      {

        if(!(list[i].equals("Z")))
        {
          answer += Integer.parseInt(list[i]);
        }

        else
        {
          answer -= Integer.parseInt(list[i-1]);
        }
        
      }


      return answer;
  }

 


}