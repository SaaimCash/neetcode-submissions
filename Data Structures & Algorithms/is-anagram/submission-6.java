class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        List<Character> set = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }

        for(int j = 0; j < t.length(); j++){
            if(set.contains(t.charAt(j))){
                set.remove(Character.valueOf(t.charAt(j))); 
            }
        }

        return set.isEmpty();
    }
}
