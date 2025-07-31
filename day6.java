class Solution {
    public boolean isValid(String s) {
        String p;
        do {
            p = s;
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (!s.equals(p));
        return s.isEmpty();
    }
}