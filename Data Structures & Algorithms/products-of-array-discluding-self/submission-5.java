class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int [nums.length];
        int[] suff = new int [nums.length];
        pref[0]=1;
        suff[nums.length-1]=1;
        for(int i=0;i<nums.length-1;i++){
            pref[i+1]=pref[i]*nums[i];
        }
        for(int i=nums.length-1;i>0;i--){
            suff[i-1]=suff[i]*nums[i];
        } 
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            result[i] = pref[i] * suff[i];
            
        }
        return result;
    } 
}
