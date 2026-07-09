class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        // 1. Push opening brackets onto the stack
        if (ch == '(' || ch == '{' || ch == '[') {
            st.push(ch);
        } 
        // 2. Handle closing brackets
        else if ( ch == ')' || ch == '}' || ch == ']' ) {
            
            if (st.isEmpty()) {
                return false;
            }
            
            char top = st.peek();
            
            if ((ch == ')' && top == '(') || 
                (ch == '}' && top == '{') || 
                (ch == ']' && top == '[')) {
                st.pop(); // Correct: pop() takes no arguments
            } else {
                return false; // Mismatched brackets
            }
        }
    }

    
    return st.isEmpty();
    }
}
