package org.re.invent.the.wheel.queues;

import org.re.invent.the.wheel.common.Node;

public class Queue {
  private Node head;
  private Node tail;

  public boolean isEmpty() {
    return head == null;
  }

  public int peek() {
    if(head == null) {
      return -1;
    }
    return head.getData();
  }

  public void enqueue(int data) {
    Node node = new Node(data);
    if(tail != null) {
      tail.setNext(node);
    }
    tail = node;
    if (head == null) {
      head = node;
    }
  }

  public int dequeue() {
    if(head == null) {
      return -1 ;
    }
    int data = head.getData();
    head = head.getNext();
    if(head == null) {
      tail = null;
    }
    return data;
  }

}
