class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int reuslt=0;

for(int i=0;i<nums.length;i+=2){
    reuslt+=nums[i];
}
return reuslt;
    }
}