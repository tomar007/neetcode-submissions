class Solution {
    public boolean isPalindrome(String s) {
        String updated_string = s.trim().toLowerCase();
        char[] characters = new char[updated_string.length()];
        int j = 0;

        for (int i=0; i<updated_string.length(); i++){
            char ch = updated_string.charAt(i);
            if((ch >= 97 && ch<=122) || (ch >= 48 && ch<=57)){
                characters[j++] = ch;
            }
        }

        int right = j-1;
        for(int i=0; i<j; i++){
            if(characters[i] != characters[right]){
                    return false;
            }
            right--;
        }

    return true;
    }
}



