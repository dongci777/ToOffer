package com.dongci777;

import java.util.LinkedList;

/**
 * @Author: zxb
 * @Date : 2021/7/14 9:05 下午
 */
public class TwoQueueRealizeStack {

    LinkedList<Integer> queue1 = new LinkedList<>();
    LinkedList<Integer> queue2 = new LinkedList<>();

    // 入栈
    public void push(int val) {
        queue1.addLast(val);
    }

    // 出栈
    public int pop() {
        int qsize = queue1.size() + queue2.size();
        if (qsize != 0) {
            if (!queue1.isEmpty()) {
                // 将剩余的n-1个移到另一个队列中
                putN_1ToAnather();
                return queue1.removeFirst();
            } else {
                putN_1ToAnather();
                return queue2.removeFirst();
            }
        } else {
            System.out.println("栈已经为空，不能出栈");
            return -1;
        }
    }

    public void putN_1ToAnather() {
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.addLast(queue1.removeFirst());
            }
        } else if (!queue2.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.addLast(queue2.removeFirst());
            }
        }
    }


    public static void main(String[] args) {
        TwoQueueRealizeStack stack = new TwoQueueRealizeStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
