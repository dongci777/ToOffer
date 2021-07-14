package com.dongci777;

/**
 * @Author: zxb
 * @Date : 2021/7/14 8:39 下午
 */
public class Fibonacci {
    // 实现方法1：最优方法
    public long fibonacci(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }
        int fib1 = 0;
        int fib2 = 1;
        int fibn = 0;

        for (int i = 2; i <= n; ++i) {
            fibn = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibn;
        }
        return fibn;
    }

    // 实现方法2：递归实现
    public long fi(int n) {
        return n <= 0 ? 0 : n + fi(n - 1);
    }
}
