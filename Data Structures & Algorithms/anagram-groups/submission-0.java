class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray(); //break each string to char
            Arrays.sort(charArray); // sort the char so it is in order
            String sortedS = new String(charArray); //store sorted word
            map.putIfAbsent(sortedS, new ArrayList<>()); // if it is not in map then we put (sorted word, a new arry).
            map.get(sortedS).add(s); //add the string s, ex: act to sorted "act" then cat to sorted "cat"
        }
        return new ArrayList<>(map.values()); // return the values which is an array.
    }
}

