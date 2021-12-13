package com.lc.solutions.linkedlist;

public class EvenList
{
    // 1 -> 2 -> 3 -> 3
    // 2

    // 2->1->1->4
    Node getEvenList(Node head)
    {
        Node newHead = head;
        Node runner = head;

        while (runner != null)
        {
            if (runner.getValue() % 2 != 0)
            {
                if (runner.getPrev() == null) //the head
                {
                    newHead = runner.getNext();
                    newHead.setPrev(null);
                }
                else
                {
                    runner.getPrev().setNext(runner.getNext());

                    if (runner.getNext() != null)
                        runner.getNext().setPrev(runner.getPrev());
                }

            }

            runner = runner.getNext();
        }

        return newHead;
    }
}
