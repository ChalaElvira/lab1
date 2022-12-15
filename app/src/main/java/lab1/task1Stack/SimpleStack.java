package lab1.task1Stack;

public class SimpleStack<T> {
  private class Node {
    public T data;
    public Node next;

    public Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  public Node top;
  private int count;

  public int getCount() {
    return count;
  }

  public SimpleStack() {
    top = null;
    count = 0;
  }

  public void push(T item) {
    top = new Node(item, top);
    count++;
  }

  public T pop() {
    T result = top.data;
    top = top.next;
    count--;
    return result;
  }

  public T peek() {
    if (top != null) {
      return top.data;
    }
    return null;
  }

  public int size() {
    return getCount();
  }

  public void showContains() {
    Node tempTop = top;
    while (tempTop != null) {
      System.out.println(tempTop.data);
      tempTop = tempTop.next;
    }
  }
}