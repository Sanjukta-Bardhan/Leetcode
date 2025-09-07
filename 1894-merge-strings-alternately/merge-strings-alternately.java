class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0;
        int j = 0;

        // Iterate while both strings have characters remaining
        while (i < word1.length() && j < word2.length()) {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(j));
            i++;
            j++;
        }

        // Append remaining characters from word1, if any
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i));
            i++;
        }

        // Append remaining characters from word2, if any
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j));
            j++;
        }

        return mergedString.toString();
    }
}