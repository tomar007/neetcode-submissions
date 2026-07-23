class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> topK = map
                     .entrySet()
                     .stream()
                     .sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue())
                     .map(entry -> entry.getKey())
                     .limit(k)
                     .toList();

        for(int i=0; i<k; i++)
            arr[i] = topK.get(i);

        return arr;
    }
}