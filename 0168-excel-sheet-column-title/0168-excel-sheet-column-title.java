class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";

        while(columnNumber > 0){
            columnNumber--;
            int remainder = (columnNumber % 26);
            char ch = (char)('A' + remainder);
            res = ch + res;
            columnNumber /= 26;
        }

        return res;
    }
}