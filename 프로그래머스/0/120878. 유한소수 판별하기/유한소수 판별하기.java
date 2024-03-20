class Solution {
    public int solution(int a, int b) {
        int s = 2;
        int e = a;
        while (s <= e) {
            if (a%s==0 && b%s==0) {
                a /= s;
                b /= s;
                e = a;
            } s++;
        }
        
        boolean state = true;
        
        while (true) {
            if (b%2==0) b/=2;
            else if (b%5==0) b/=5;
            else {
                state = false;
                break;
            }
        }
        return (b==1)?1:2;
    }
}