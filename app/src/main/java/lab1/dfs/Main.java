package lab1.dfs;

public class Main {
    public static void show(char[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        char[][] array = new char[][]{
//                {'.', '.', 'F'},
//                {'S', '.', '#'},
//                {'#', '.', '.'},
//        };
        char[][] array = new char[][]{
                {'#', 'S', '#','.','.','.','.','#'},
                {'#', '.', '#','.','#','#','.','#'},
                {'#', '.', '.','.','#','.','.','#'},
                {'#', '#', '#','#','.','.','#','#'},
                {'#', '.', '.','.','.','#','F','#'},
                {'#', '.', '#','.','.','#','.','#'},
                {'#', '.', '#','#','#','#','.','#'},
                {'#', '.', '.','.','.','.','.','#'}
        };
        Graph graf = new Graph(array);
        graf.DFS();
        show(array);

    }
}
