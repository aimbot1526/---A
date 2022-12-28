class LCP {

    public String longestCommonPrefix(String[] strs) {
        //Check the String if empty or not
        if (strs.length == 0) return "";
        // Take first element as prefix
        String prefix = strs[0];
        // Iterate over array from first to last element
        for (int i = 1; i < strs.length; i++) {
            // while prefix is available in left out array
            // concat prefix
            while (strs[i].indexOf(prefix) != 0) {
                int j = strs[i].indexOf(prefix);
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
