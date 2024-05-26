package org.re.invent.the.wheel;

import org.re.invent.the.wheel.lists.LinkedList;

public class Main {

  public static void main(String[] args) {

    System.out.println("Linked Lists . . .");
    LinkedList list = new LinkedList();
    // append some data
    list.append(10);
    list.append(5);
    list.append(16);

    // print current state
    list.print();

    // prepend some data
    list.prepend(1);
    list.prepend(3);

    // print current state
    list.print();
    list.deleteWithValue(16);
    list.deleteWithValue(3);

    list.print();

  }
}