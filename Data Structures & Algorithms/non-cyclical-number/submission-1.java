class Solution {
    public boolean isHappy(int n) {
        int result = 0;
        int digit = 0;
        Set<Integer> sums = new HashSet<>();

        while(result != 1){
            result = 0;

            // logic to add the squares of the digits
            while(n != 0){
                digit = n%10;
                result = result + digit*digit;
                n = n/10;
            }

            // check if result is duplicate
            if(sums.contains(result))
                return false;

            // store the result in the set
            sums.add(result);
            
            // update the number
            n = result;
        }

    return true;
    }
}
