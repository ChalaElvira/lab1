package lab1.task1Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleStackTest {

  @Test
  void getCount() {
    SimpleStack<Integer> test = new SimpleStack<>();
    assertEquals(0, test.getCount());
    test.push(1);
    assertEquals(1, test.getCount());
    test.push(2);
    assertEquals(2, test.getCount());
    test.pop();
    assertEquals(1, test.getCount());
  }

  @Test
  void push() {
    SimpleStack<Integer> test = new SimpleStack<>();
    test.push(0);
    assertEquals(0, test.peek());
    test.push(1);
    test.push(2);
    test.push(3);
    assertEquals(3, test.peek());
  }

  @Test
  void pop() {
    SimpleStack<Integer> test = new SimpleStack<>();
    test.push(0);
    assertEquals(0, test.pop());
    test.push(1);
    test.push(2);
    test.push(3);
    assertEquals(3, test.pop());
    assertEquals(2, test.pop());
    assertEquals(1, test.pop());
  }

  @Test
  void peek() {
    SimpleStack<Integer> test = new SimpleStack<>();
    test.push(0);
    assertEquals(0, test.peek());
    test.push(1);
    test.push(2);
    test.push(3);
    assertEquals(3, test.peek());
    assertEquals(3, test.peek());
  }
}