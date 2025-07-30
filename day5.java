class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> convert = new HashMap<>();
        convert.put('I', 1);
        convert.put('V', 5);
        convert.put('X', 10);
        convert.put('L', 50);
        convert.put('C', 100);
        convert.put('D', 500);
        convert.put('M', 1000);

        int solution = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            int currentVal = convert.get(s.charAt(j));
     
            if (j < s.length() - 1) {
                int nextVal = convert.get(s.charAt(j + 1));
                if (currentVal < nextVal) {
                    solution -= currentVal;
                } else {
                    solution += currentVal;
                }
            } else {
            
                solution += currentVal;
            }
        }
        return solution;
    }
}