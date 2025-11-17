class Solution {
    public String solution(String new_id) {
        String temp = new_id.toLowerCase();
        temp = temp.replaceAll("[^a-z0-9-_.]","");
        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");
        temp = temp.isEmpty()?"a":temp.length()<15?temp:temp.substring(0,15);
        temp = temp.replaceAll("[.]$","");
        if (temp.length()<=2) {
            StringBuilder sb = new StringBuilder(temp);
            int ln = temp.length();
            while (ln<=2) {
                sb.append(sb.charAt(ln-1));
                ln++;
            }
            temp = sb.toString();
        }
        return temp;
    }
}