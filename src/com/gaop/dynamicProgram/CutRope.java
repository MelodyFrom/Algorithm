package com.gaop.dynamicProgram;

/**
 * 剪绳子-动态规划示例 <br></>
 * 给你一根长度为 n 的绳子，请把绳子剪成 m 段，并使得这 m 段绳子的乘积最大，求最大乘积
 * @author gaopeng@doctorwork.com
 * @date 2019-02-18 21:51
 **/
public class CutRope {

    public static int cutRope(int length) {
        int lengthOfZero = 0;
        int lengthOfOne = 1;
        int lengthOfTwo = 2;
        int lengthOfThree = 3;
        if (length < 2)
            return 0;
        if (length == 2)
            return lengthOfTwo;
        if (length == 3)
            return lengthOfThree;
        int[] lengths = new int[length+1];
        lengths[0] = lengthOfZero;
        lengths[1] = lengthOfOne;
        lengths[2] = lengthOfTwo;
        lengths[3] = lengthOfThree;
        int max = 0;
        for (int i = 4; i <= length; i++) {
            for (int j = 1; j <= i / 2; j++) {
                int curLength = lengths[j] * lengths[i - j];
                if (curLength > max)
                    max = curLength;
                lengths[i] = max;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(CutRope.cutRope(8));
    }
}
