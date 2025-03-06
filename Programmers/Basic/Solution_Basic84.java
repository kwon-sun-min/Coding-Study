import java.util.Arrays;

class Solution84 {
    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) 
        {
            if(Arrays.equals(id_pw, db[i]))
            {
                return "login";
            }

            else if(db[i][0].equals(id_pw[0]))
            {
                return "wrong pw";
            }
            
        }
        return "fail";
    }

}