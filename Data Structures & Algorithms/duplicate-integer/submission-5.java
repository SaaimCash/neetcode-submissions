class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> i = new HashSet<>();
        for(int j : nums){
                if (i.contains(j)){
                    return true;
                } 
                    i.add(j);
        }
          
        return false;
    }
}