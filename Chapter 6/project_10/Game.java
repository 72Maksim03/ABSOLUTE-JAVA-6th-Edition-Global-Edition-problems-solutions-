public class Game {
    private int n;
    private char[][] grid;
    private int rowPos;
    private int colPos;

    public Game(int gridSize){
        n = gridSize;
        grid = new char[n][n];
        fillGrid();
        rowPos = (int) (Math.random() * n);
        colPos = (int) (Math.random() * n);
        grid[rowPos][colPos] = 'N';
    }

    public Game(){this(4);}

    private void fillGrid(){
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = '*';
    }

    public void move(String move){
        int newRow = rowPos;
        int newCol = colPos;

        if (move.equalsIgnoreCase("left")) newCol--;
        else if (move.equalsIgnoreCase("right")) newCol++;
        else if(move.equalsIgnoreCase("up")) newRow--;
        else if (move.equalsIgnoreCase("down")) newRow++;
        else {
            System.out.println("Invalid move");
            System.exit(0);
        }

        if (newCol < 0 || newCol >= n || newRow < 0 || newRow >= n){
            System.out.println("Invalid move");
            System.exit(0);
        }

        grid[rowPos][colPos] = '$';
        colPos = newCol;
        rowPos = newRow;
        grid[rowPos][colPos] = 'N';
    }

    public void printGrid(){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
}
