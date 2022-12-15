package lab1.dfs;


import lab1.task1Stack.SimpleStack;

public class Graph {
  private boolean[][] visited;
  private char[][] matrix;
  SimpleStack<Pos> stack = new SimpleStack<>();

  public Graph(char[][] matrix) {
    this.matrix = matrix;
    visited = new boolean[matrix.length][matrix[0].length];
  }

  class Pos {
    int i;
    int j;
    Pos from;

    Pos(int i, int j, Pos from) {
      this.i = i;
      this.j = j;
      this.from = from;
    }
  }

  Pos findStart() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 'S') {
          visited[i][j] = true;/////////////////// цього не було і тому зависало
          return new Pos(i, j, null);
        }
      }
    }
    return null;
  }

  boolean isAdd(int i, int j) {
    if (i <= -1 || j <= -1 || i >= matrix.length || j >= matrix[0].length) {
      return false;
    }

    if (matrix[i][j] == '#') {
      return false;
    }

    return !visited[i][j];
  }

  void add(int i, int j, Pos pos) {
    Pos temp = new Pos(i, j, pos);
    stack.push(temp);
    visited[i][j] = true;
  }

  public void DFS() {
    stack.push(findStart());
    char currentVal = 's';

    //Тут в циклі тільки пошук (заповнення stack)
    while (currentVal != 'F') {

      Pos current = stack.peek();
      currentVal = matrix[current.i][current.j];

      //Запакував if в окрему функцію, якось так красивіше :)
      checkAndAdd(current.i + 1, current.j, current);
      checkAndAdd(current.i, current.j + 1, current);
      checkAndAdd(current.i - 1, current.j, current);
      checkAndAdd(current.i, current.j - 1, current);
    }

    //Тут в циклі рисування (очищання stack)
    while (stack.top != null) {

      Pos p = stack.pop();
      Pos from = p.from;

      if (from != null && matrix[from.i][from.j] != 'S') { // я цей костиль не знаю як прибрати :)
        matrix[from.i][from.j] = 'x';
      }
    }
  }

  private void checkAndAdd(int i, int j, Pos current) {
    if (isAdd(i, j)) {
      add(i, j, current);
    }
  }
}
