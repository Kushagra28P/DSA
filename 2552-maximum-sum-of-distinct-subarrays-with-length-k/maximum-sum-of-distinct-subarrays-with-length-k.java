class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int start  = 0;
        long sum=0;
        long max =0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[start]);
                sum = sum-nums[start];
                start++;
            }
            set.add(nums[i]);
            sum = sum +nums[i];
            if(i-start+1==k){
                max  =Math.max(max,sum);
                set.remove(nums[start]);
                sum = sum - nums[start];
                start++;
        
         }

        }
        return max;
    }
}