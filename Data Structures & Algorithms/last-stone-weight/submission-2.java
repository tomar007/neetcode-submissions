class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    for(int num:stones){
        maxHeap.add(num);
    }

    for(int i=1; i<=stones.length - 1; i++){
        maxHeap.add(maxHeap.poll() - maxHeap.poll());
    }
    
        
    return maxHeap.poll();
    }
}
