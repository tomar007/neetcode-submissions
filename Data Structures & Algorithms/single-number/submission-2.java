class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }
            else
                set.remove(num);
        }

        for(int num: set)
            return num;
        
    return 0;
    }
}
