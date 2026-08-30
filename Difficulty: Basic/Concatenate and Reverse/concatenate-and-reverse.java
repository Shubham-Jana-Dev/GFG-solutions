class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String S =  s1+s2;
        String result = "";
        for(int i = 0; i<S.length();i++){
            result = S.charAt(i) + result;
        }
        return result;
    }
}