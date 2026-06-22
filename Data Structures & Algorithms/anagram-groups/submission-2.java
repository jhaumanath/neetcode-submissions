class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> outputMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < strs.length ; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if(outputMap.containsKey(key)){
                outputMap.get(key).add(strs[i]);
            }
            else{
                outputMap.put(key, new ArrayList<>());
                outputMap.get(key).add(strs[i]);
            }
        }
        for(String key : outputMap.keySet()){
            result.add(outputMap.get(key));
        }
        return result;
    }
}
