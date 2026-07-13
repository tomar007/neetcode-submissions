class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        if(s.length() != t.length())
            return false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                count++;
                map.put(ch, count);
            }
            else
                map.put(ch, 1);
        }
            

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                int count = map2.get(ch);
                count++;
                map2.put(ch, count);
            }
            else
                map2.put(ch, 1);
        }

        for(char ch: map.keySet()){
            if(map2.containsKey(ch)){
                if(!map.get(ch).equals(map2.get(ch)))
                    return false;
            }
            else
                return false;
        }
        
    return true;
    }
}
