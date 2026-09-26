class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        ArrayList<Character> list = new ArrayList<>();

        
        for(int k = 0; k < s.length(); k++){
            char c = s.charAt(k);
            if((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                list.add(c);
            }
        }
        
        int i = 0;
        int j = list.size() - 1;

        while(i < j){
            if(list.get(i) != list.get(j)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}
