class Solution {
    public int solution(int[] c) {
            if (c[1]-c[0] == c[2]-c[1]) return c[c.length-1]+c[2]-c[1];
            else return c[c.length-1]*(c[2]/c[1]);
        }
}