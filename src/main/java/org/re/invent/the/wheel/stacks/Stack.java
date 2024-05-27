package org.re.invent.the.wheel.stacks;

import org.re.invent.the.wheel.common.Node;

public class Stack {

  Node top;

  public boolean isEmpty() {
    return top == null;
  }

  public int peek() {
    if(top == null) {
      return -1;
    }
    return top.getData();
  }

  public void push(int data) {
    Node node = new Node(data);
    node.setNext(top);
    top = node;
  }

  public int pop() {
    if(top == null) {
      return -1;
    }
    int data = top.getData();
    top = top.getNext();
    return data;
  }

}
