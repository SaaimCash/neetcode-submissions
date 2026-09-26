class Solution {
    public int search(int[] nums, int target) {
         int h = nums.length - 1;
         int l = 0;


         while (l <= h){
            int mid = ((h + l) / 2);

            if(nums[mid] == target){
                return mid;
            } else if(target > nums[mid]){
                l = mid + 1;
            } else{
                h = mid - 1;
            }
         }

         return -1;
    }
}
