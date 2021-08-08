package LC只出现一次的数字;

class Solution {
    public int singlenumber(int[] nums){
        int ans=0;
        for(int i:nums){
            ans=ans^i;
        }
        return ans;
    }
}
