class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
		int length = temperatures.length;
		int[] result = new int[length];
		int c = 0;
		int flag = 0;

        for(int i=0; i<length; i++){
			c=1;
			flag = 0;
			for(int j=i+1; j<length; j++){
				if(temperatures[i] < temperatures[j]){
					flag = 1;
					break;
				}
				else{
					c++;
				}
			}

			if(flag == 1)
				result[i]=c;
			else 
				result[i]=0;
		}
	return result;
    }
}
