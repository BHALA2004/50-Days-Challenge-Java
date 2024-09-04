class Solution {
    public boolean isValid(String s) {

         while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            }
        }
        return s.isEmpty();
        
    }
}