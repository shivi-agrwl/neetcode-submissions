class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        HashSet<Integer> setStart = new HashSet<Integer>();
        for(Integer i:set){
            int num=i;
            if(!set.contains(num-1)){
                setStart.add(i);

            }
        }
        int max=0;
        for(int i:setStart){
            int lmax=1;
            int current = i;
            while(set.contains(current + 1)){
                lmax++;
                current++;
            }
            if(lmax>max){
                max=lmax;
            }
        }
    
        return max;
    }
}