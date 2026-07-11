class Solution {
    public boolean isPalindrome(String s) {
        String updated_string = s.trim().toLowerCase();
        char[] characters = new char[updated_string.length()];
        int j = 0;

        for (int i=0; i<updated_string.length(); i++){
            char ch = updated_string.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                characters[j++] = ch;
            }
        }

       
        int left = 0;
        int right = j-1;

        while(left < right){
            if(characters[left] != characters[right]){
                    return false;
            }
            left++;
            right--;
        }

    return true;
    }
}



