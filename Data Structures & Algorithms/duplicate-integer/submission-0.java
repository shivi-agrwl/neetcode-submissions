
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        //number,count
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
                return true;
            }
            else{
                map.put(num,1);
            }
        }
        return false;
    }
}
