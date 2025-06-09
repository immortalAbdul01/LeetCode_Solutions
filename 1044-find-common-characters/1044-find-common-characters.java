class Solution {
    public List<String> commonChars(String[] words) {
       int[] map = new int[26];
        Arrays.fill(map, Integer.MAX_VALUE); 

        for (int i = 0; i < words.length; i++) {
            int[] freq = new int[26]; 
            for (char ch : words[i].toCharArray()) {
                freq[ch - 'a']++;
            }

            
            for (int j = 0; j < 26; j++) {
                map[j] = Math.min(map[j], freq[j]);
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < map[i]; j++) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }

        return ans;
    
    }
}