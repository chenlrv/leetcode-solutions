package com.lc.solutions.linkedlist;

public class List
{
    static Node getEvenList(Node head)
    {
        Node newHead = head;
        Node runner = head;

        while (runner != null)
        {
            if (runner.value % 2 != 0)
            {
                if (runner.prev == null) //the head
                {
                    newHead = runner.next;
                    newHead.prev = null;
                }
                else
                {
                    runner.prev.next = runner.next;

                    if (runner.next != null)
                        runner.next.prev = runner.prev;
                }

            }

            runner = runner.next;
        }

        return newHead;
    }

    public static void main(String[] args)
    {
        Node l1n3 = new Node(2, null);
        Node l1n2 = new Node(3, l1n3);
        Node l1n1 = new Node(1, l1n2);
        l1n3.setPrev(l1n2);
        l1n2.setPrev(l1n1);

        System.out.println("List before :" + l1n1);
        System.out.println("List after:" + getEvenList(l1n1));

        Node l2n4 = new Node(5, null);
        Node l2n3 = new Node(5, l2n4);
        Node l2n2 = new Node(1, l2n3);
        Node l2n1 = new Node(2, l2n2);

        l2n4.setPrev(l2n3);
        l2n3.setPrev(l2n2);
        l2n2.setPrev(l2n1);

        System.out.println("List before :" + l2n1);
        System.out.println("List after:" + getEvenList(l2n1));
    }


    static class Node
    {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }

        public void setPrev(Node prev)
        {
            this.prev = prev;
        }

        @Override
        public String toString()
        {
            return "[" + value + "]" + (next != null ? next : "");
        }
    }
}
