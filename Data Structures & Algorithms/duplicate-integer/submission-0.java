class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0;
        // int j = nums.length - 1;

        // while (i <= j){
        //     if (nums[i] == nums[j]){
        //         return true;
        //     }

        //     i++;
        //     j--;
        // }
        // return false;

        Set<Integer> set = new HashSet<>();

        while(i < nums.length){
            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);
            i++;

        }
        return false;
    }
}