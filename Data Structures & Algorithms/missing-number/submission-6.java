class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
         for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

        int missing = 0;
        if(nums[0]!=0)
            return missing;
        
        if(nums[nums.length-1] != nums.length)
            return nums.length;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1] + 1)
                return (nums[i]+nums[i-1])/2;
        }

    return 0;
    }
}
