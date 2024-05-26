package org.re.invent.the.wheel.lists;

import org.re.invent.the.wheel.common.Node;

public class LinkedList {
  Node head;

  public void append(int data) {
    if(head == null) {
      head = new Node(data);
      return;
    }

    Node current = head;
    while(current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(new Node(data));
  }

  public void prepend(int data) {
    Node newHead = new Node(data);
    newHead.setNext(head);
    head = newHead;
  }

  public void deleteWithValue(int data) {
    if (head == null) {
      return;
    }

    if (head.getData() == data) {
      head = head.getNext();
      return;
    }
    Node current = head;
    while(current.getNext() != null) {
      if (current.getNext().getData() == data) {
        current.setNext(current.getNext().getNext());
        return;
      }
      current = current.getNext();
    }
  }

  public void print() {
    Node current = head;
    while(current != null) {
      System.out.print(current.getData() + " ");
      current = current.getNext();
    }
    System.out.println();
  }

}
