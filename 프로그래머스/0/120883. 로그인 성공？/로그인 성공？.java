class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (int i=0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0])&& db[i][1].equals(id_pw[1])) return "login";
            else if (db[i][0].equals(id_pw[0])) return "wrong pw";
        }
        return "fail";
    }
}