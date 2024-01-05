package com.study.algorithm_design;

/**
 * @date 2023/11/6 14:32
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println(result); // 输出："bab"
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, i, i);    // 找到以s[i]为中心的奇数长度的回文串长度
            int len2 = expandAroundCenter(s, i, i + 1);  // 找到以s[i]和s[i+1]之间位置为中心的偶数长度的回文串长度
            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int n = s.length();

        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}

