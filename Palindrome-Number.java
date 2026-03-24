1class Solution {
2    public boolean isPalindrome(int x) {
3
4        if(x<0) return false;
5        int rev = 0;
6        int remainder;
7
8        int y =x;
9        while(x!=0){
10            remainder = x%10;
11            rev = rev*10+remainder;
12            x/=10;
13        }
14        return y==rev;
15
16    }
17}