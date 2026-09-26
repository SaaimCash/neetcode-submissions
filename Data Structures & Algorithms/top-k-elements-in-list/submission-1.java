class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        if (nums.length == 0){
            return nums;
        }

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] arr = new int[k];

        for(int i = 0; i < k; i++){
            Integer mf = null;
            int max = -1;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    mf = entry.getKey();
                }
            }
           if(mf != null){
            arr[i] = mf;
            map.remove(mf);
           }
            
        }

    return arr;
    }
}
