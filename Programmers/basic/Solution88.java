class Solution88 {
  public int solution(int[][] board) {
      int answer = 0;
      int width = board[0].length-1;
      int height = board.length-1;

      for (int i = 0; i < board.length; i++) 
      {
        for (int j = 0; j < board[i].length; j++) 
        {
          if(board[i][j] == 1)
          {
            if(width >= i+1  &&  board[i+1][j] == 0) {board[i+1][j] = 9;}
            if(0 <= i-1  &&  board[i-1][j] == 0) {board[i-1][j] = 9;}
            if(height >= j+1  &&  board[i][j+1] == 0) {board[i][j+1] = 9;}
            if(0 <= j-1  &&  board[i][j-1] == 0) {board[i][j-1] = 9;}
            if(width >= i+1  &&  height >= j+1  &&  board[i+1][j+1] == 0) {board[i+1][j+1] = 9;}
            if(width >= i+1  &&  0 <= j-1  &&  board[i+1][j-1] == 0) {board[i+1][j-1] = 9;}
            if(0 <= i-1  &&  height >= j+1  &&  board[i-1][j+1] == 0) {board[i-1][j+1] = 9;}
            if(0 <= i-1  &&  0 <= j-1  &&  board[i-1][j-1] == 0) {board[i-1][j-1] = 9;}
          }
        }
      }

      for (int i = 0; i < board.length; i++) 
      {
        for (int j = 0; j < board[i].length; j++) 
        {
          if(board[i][j] == 0)
          {
            answer++;
          }
        }
        
      }

      return answer;
  }

  public static void main(String[] args) 
  {
    Solution88 sol = new Solution88();
    int[][] input1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
    System.out.println(sol.solution(input1));

    
  }
}