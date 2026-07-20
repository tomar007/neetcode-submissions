class KthLargest {
    private PriorityQueue<Integer> heap = new PriorityQueue<>();
    private int k = 0;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        
        for(int i=0; i<nums.length; i++){
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        heap.add(val);

        if(heap.size() > k)
            heap.poll();

        return heap.peek();
    }
}
