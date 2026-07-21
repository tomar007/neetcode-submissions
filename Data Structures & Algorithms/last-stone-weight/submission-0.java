class Solution {
    public int lastStoneWeight(int[] stones) {

       for(int i=stones.length - 1; i > 0; i--){
            // Sort in ascending order
            Arrays.sort(stones,0,i+1); 

            System.out.println("i: "+i);
            for(int num:stones) System.out.print(num+" ");
            System.out.println();

            //update array
            stones[i-1] = stones[i] - stones[i-1];
            for(int num:stones) System.out.print(num+" ");

            System.out.println();
        }
        
    return stones[0];
    }
}
