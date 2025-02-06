class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> res = new ArrayList<>();
        if(digits.isEmpty()) return res;

        backtrack(digits, 0, res, new char[digits.length()], map);
        return res;
    }

    void backtrack(String digits, int i, List<String> res, char[] temp, String[] map) {
        if(i == digits.length()) {
            res.add(new String(temp));
            return;
        }

        char ch = temp[i];
        // following for loop worst case runs maximum 4 times as there will be max 4 letters for a number ex, 7 & 9.
        // this is why the work per node of recursion tree will be O(1)
        for(char c: map[digits.charAt(i)-'0'].toCharArray()) {
            temp[i] = c;
            backtrack(digits, i+1, res, temp, map);
            temp[i] = ch;
        }
    }
}