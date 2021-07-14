package com.dongci777;

import java.util.Stack;

/**
 * @Author: zxb
 * @Date : 2021/7/14 8:52 下午
 */
public class TwoStackRealizeQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // 入队，使用stack1

    public void appendTail(int x) {
        stack1.push(x);
    }

    // 出队，结合stack1和stack2
    public int deleteHead() {
        int qsize = stack1.size() + stack2.size();
        if (qsize != 0) {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        } else {
            System.out.println("队列为空，不能进行对头出列了");
            return -1;
        }
    }

    public static void main(String[] args) {
        TwoStackRealizeQueue q = new TwoStackRealizeQueue();
        q.appendTail(1);
        q.appendTail(2);
        q.appendTail(3);
        q.appendTail(4);

        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());

        q.appendTail(5);
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());

    }
}
