class Solution76 {
  public int solution(String[] babbling) {
      String[] word = {"aya", "ye", "woo", "ma"};
      int answer = babbling.length;
      for (int i = 0; i < babbling.length; i++) 
      {
        for (int j = 0; j < word.length; j++) 
        {
          babbling[i] = babbling[i].replace(word[j], "@");
        }

        for (int j = 0; j < babbling[i].length(); j++) 
        {
          if(babbling[i].charAt(j) != '@')
          {
            answer--;
            break;  
          }
          
        }
        
      }
      return answer;
  }
  
}