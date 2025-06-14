class Solution {
    public String capitalizeTitle(String title) {
        
   String [] words = title.split(" ");

   StringBuilder ans = new StringBuilder();
   for(String word: words){
    if(word.length()>2){
        ans.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());

    }
    else{
       ans.append( word.toLowerCase());
    }
    ans.append(" ");
   }
return ans.toString().trim();   
    }
}