class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        //Create baskets. Index = Frequency, Value = List of numbers with that frequency
        //The maximum possible frequency is nums.length, so we need nums.length + 1 baskets
        List<Integer>[] buckets = new ArrayList[nums.length+1];

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key: map.keySet()){
            int frequency = map.get(key);

            // If the basket at this frequency doesn't exist yet, build it
            if(buckets[frequency] == null)
                buckets[frequency] = new ArrayList<>();

            // Put the number into its correct basket
            buckets[frequency].add(key);
        }
      
        int[] arr = new int[k];
        int index=0;

        for(int i= buckets.length-1; i>=0 && index<k; i--){
            if(buckets[i]!=null){
                for(int num: buckets[i]){
                    arr[index++]=num;
                    if(index == k){
                        return arr;
                    }
                }   
            }
            
        } 

        return arr;
    }
}