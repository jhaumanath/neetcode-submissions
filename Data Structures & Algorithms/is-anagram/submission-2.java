class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> anagram = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            anagram.merge(s.charAt(i), 1, Integer::sum);
        }
        for(int i = 0; i< t.length(); i++){
            if(!anagram.containsKey(t.charAt(i))){
                return false;
            }
            else{
                anagram.computeIfPresent(t.charAt(i), (k,v)-> v == 1 ? null : v - 1 );
            }
        }
        return true;
    }
}
