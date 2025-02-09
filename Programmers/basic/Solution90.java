class Solution90 {
  public int solution(String[] spell, String[] dic) {
      int answer = 2;

      for (int i = 0; i < dic.length; i++) 
      {
        for (int j = 0; j < spell.length; j++) 
        {
          String temp = dic[i];
          dic[i] = dic[i].replaceFirst(spell[j], "");
          if(temp.equals(dic[i]))
          {
            dic[i] = "@";
          }
        }
        
        if(dic[i].equals(""))
        {
          return 1;
        }
      }
      return answer;
  }

  public static void main(String[] args) 
  {
    String[] spell1 = {"p", "o", "s"};
    String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};

    String[] spell2 = {"z", "d", "x"};
    String[] dic2 = {"def", "dww", "dzx", "loveaw"};

    String[] spell3 = {"s", "o", "m", "d"};
    String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};

    Solution90 sol = new Solution90();
    System.out.println(sol.solution(spell1, dic1));
    System.out.println(sol.solution(spell2, dic2));
    System.out.println(sol.solution(spell3, dic3));
    
    
  }
}