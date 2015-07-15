package leetcode;

class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String first = strs[0];
        for(int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for(int j = 1; j < strs.length; j++) {
                String s = strs[j];
                if (s.length() <= i || s.charAt(i) != c) return first.substring(0, i);
            }
        }
        return first;
    }
    
    public static void main(String[] args) {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        System.out.println(prefix.longestCommonPrefix(new String[]{"a", "ab"}));
    }
}