class Solution {
    public boolean helpingPalindrome( int i,int j,String s){
    while (i<j){
        if (s.charAt(i) != s.charAt(j)){
            return false;
        }
        else{
            i=i+1;
            j=j-1;
        }
    }
    return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char right=s.charAt(i);
            char left=s.charAt(j);
            if(left!=right){
                return helpingPalindrome(i+1,j,s) || helpingPalindrome(i,j-1,s);
//superpower
            }
            else{
                i=i+1;
                j=j-1;
            }
        }
        return true;
    }
}