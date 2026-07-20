class KthLargest {
    private int[] nums = null;
    private int k = 0;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }
    
    public int add(int val) {
        int[] updated = new int[nums.length + 1];

        for(int i=0; i<nums.length; i++)
            updated[i] = nums[i];
        
        updated[updated.length - 1] = val;
        nums = updated;
        
        Arrays.sort(nums); 

        return nums[nums.length-k];
        /*
        for(int i=0; i<nums.length; i++)
            System.out.println(nums[i]);

         System.out.println();
        */
    }
}
