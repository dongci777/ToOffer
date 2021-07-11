package com.dongci777;

/**
 * @Author: zxb
 * @Date : 2021/7/11 9:42 下午
 */

/**
 * 时间复杂度：O（n）
 */
public class ReplaceBlankSpace {
    public static String replaceSpace(char[] str, int length) {
        if (str == null || length <= 0) {
            return null;
        }
        int originalLength = 0, numberOfBlank = 0, i = 0;
        while (str[i] != '\0') {
            ++originalLength;
            if (str[i] == ' ') {
                ++numberOfBlank;
            }
            ++i;
        }
        int newLength = originalLength + numberOfBlank * 2;
        if (newLength > length) {
            return null;
        }
        int indexOfOriginal = originalLength;
        int indexOfNew = newLength;
        while (indexOfOriginal >= 0 && indexOfNew > indexOfOriginal) {
            if (str[indexOfOriginal] == ' ') {
                str[indexOfNew--] = '0';
                str[indexOfNew--] = '2';
                str[indexOfNew--] = '%';
            } else {
                str[indexOfNew--] = str[indexOfOriginal];
            }

            --indexOfOriginal;
        }
        return str.toString();
    }
}
