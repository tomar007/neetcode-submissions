class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    for(int num:stones){
        maxHeap.add(num);
    }

    while(maxHeap.size() > 1){
        int firstHeaviest = maxHeap.poll();
        int secondHeaviest = maxHeap.poll();

        if(firstHeaviest != secondHeaviest)
            maxHeap.add(firstHeaviest - secondHeaviest);
    }
    
    return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
