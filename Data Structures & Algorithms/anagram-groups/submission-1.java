class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> outputMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        outputMap.put(strs[0],new ArrayList<String>());
        outputMap.get(strs[0]).add(strs[0]);
        for(int i =1; i< strs.length; i++){
            boolean found = false;
            for(String key : outputMap.keySet()){
                if(areAnagrams(key,strs[i])){
                    outputMap.get(key).add(strs[i]);
                    found = true;
                    break;
                }
            }
            if(!found){
                outputMap.put(strs[i],new ArrayList<String>());
                outputMap.get(strs[i]).add(strs[i]);
            }
        }
        for(String key : outputMap.keySet()){
            result.add(outputMap.get(key));
        }
        return result;
    }
    public boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    }

    HashMap<Character, Integer> freqMap = new HashMap<>();

    // Count characters in str1
    for (int i = 0; i < str1.length(); i++) {
        char ch = str1.charAt(i);
        freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
    }

    // Decrease count using str2
    for (int i = 0; i < str2.length(); i++) {
        char ch = str2.charAt(i);

        if (!freqMap.containsKey(ch)) {
            return false;
        }

        freqMap.put(ch, freqMap.get(ch) - 1);

        if (freqMap.get(ch) == 0) {
            freqMap.remove(ch);
        }
    }

    return freqMap.isEmpty();
}
}
