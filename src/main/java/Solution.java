public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if array length is 0, there is nothing to compare. Return empty string.
        if (strs.length == 0) {
            return "";
        }

        // set prefix to first element in array
        String prefix = strs[0];

        // loop from the second element to the last index
        for (int i = 1; i < strs.length; i++) {

            // while we cannot find the prefix at the beginning of this element
            while (strs[i].indexOf(prefix) != 0) {
                //decrease the size of the prefix and check again
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
