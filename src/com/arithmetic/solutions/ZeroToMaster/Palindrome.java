package com.arithmetic.solutions.ZeroToMaster;

import jdk.nashorn.api.tree.IfTree;

import java.util.List;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        ListNode n4 = new ListNode(1);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        boolean check = isPalindromeStack(n1);
        System.out.println(check);
    }

    public static boolean isPalindrome(ListNode head) {
        boolean fp = false;
        int nodeLength = getCount(head);
        System.out.println(nodeLength);
        ListNode firsthead = head;
        ListNode currentNode = head;
        for (int i = 1; i <= nodeLength; i++) {
            //if (head.next.val == head.val) ;
            System.out.println(currentNode.val);
            if (currentNode.next == null) {
                if (firsthead.val == currentNode.val) {
                    System.out.println("firsthead----:" + firsthead.val + "currentNode.val----:" + currentNode.val);
                    firsthead = firsthead.next;

                }
            }
            currentNode = currentNode.next;
        }
        return fp;
    }

    /* Returns count of nodes in linked list */
    public static int getCount(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static boolean isPalindromeStack(ListNode head) {
        ListNode slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while (slow != null) {
            stack.push(slow.val);
            slow = slow.next;
        }

        while (head != null) {
            int i = stack.pop();
            if (head.val == i) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
        // return fp;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


