class Solution {
     int firstOccurence(String txt, String pat) {
         String newString = "";
         for(int j = 0; j < txt.length(); j++){
             if(!newString.contains(pat)){
                 newString = newString + txt.charAt(j);
             }else{
                 break;
             }
         }
         if(newString.contains(pat)){
         return (newString.length() - pat.length());
         }else{
             return -1;
         }
     }
 }