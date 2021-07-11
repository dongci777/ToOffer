package com.dongci777.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: zxb
 * @Date : 2021/7/11 11:46 下午
 */
public class PrintListNodeFromTailToHead {
    /**
     * 利用栈来反向打印链表
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> print(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ArrayList<Integer> print = print(node1);
        for (int i : print) {
            System.out.println(i);
        }
    }
}
