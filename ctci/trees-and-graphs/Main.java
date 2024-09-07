import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 10, 11, 15, 16, 17, 20, 31, 34, 35};
        int left = 0;
        int right = arr.length - 1;
        Node root = buildBst(arr, left, right);
        print(root);
    }

    private static Node buildBst(int[] arr, int left, int right) {
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        Node leftChild = buildBst(arr, left, mid - 1);
        Node rightChild = buildBst(arr, mid + 1, right);
        return new Node(arr[mid], leftChild, rightChild);
    }

    private static void print(Node root) {
       Deque<Node> queue = new ArrayDeque<>();
       queue.offer(root);
       Deque<Node> newQueue = new ArrayDeque<>();
       StringBuilder currentLevel = new StringBuilder();
       while(!queue.isEmpty()) {
          Node current = queue.pollFirst();
          if(current.left != null) {
            newQueue.offer(current.left);
          }
          if(current.right != null) {
            newQueue.offer(current.right);
          }
          currentLevel.append(String.valueOf(current.value) + " ");
          if(queue.isEmpty()) {
            queue.addAll(newQueue);
            newQueue.clear();
            System.out.println(new String(currentLevel));
            currentLevel = new StringBuilder();
          }

       }
    }

    static class Node {
        int value;
        Node left;
        Node right;
        Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
