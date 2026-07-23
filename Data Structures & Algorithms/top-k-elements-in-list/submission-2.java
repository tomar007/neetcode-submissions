class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (entry1,entry2) -> entry1.getValue() - entry2.getValue());

        int[] arr = new int[k];
        Map<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(entry);

            if(minHeap.size() > k)
                minHeap.poll();
        }
    
        int i=0;
        while(!minHeap.isEmpty()){
            arr[i] = minHeap.poll().getKey();
            i++;
        }

        return arr;
    }
}