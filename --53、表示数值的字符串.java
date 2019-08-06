public class Solution {
    public boolean isNumeric(char[] str) {
        String ss= String.valueOf(str);
        return ss.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }
}