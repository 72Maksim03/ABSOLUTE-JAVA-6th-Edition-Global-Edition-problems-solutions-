import java.util.Scanner;

public class Game {
    public static final int BOARD_SIZE = 4;
    private Board board;
    private int moves;

    public Game(int boardSize, int moves) {
        if (boardSize % 2 != 0){
            System.out.println("Board size should be even");
            System.exit(0);
        }
        this.board = new Board(boardSize);
        this.moves = moves;
    }

    public Game(){this(BOARD_SIZE, 64);}

    public void playGame(){
        System.out.println("Moves: " + moves);
        board.printBoard();
        Scanner sc = new Scanner(System.in);
        while(moves > 0){
            System.out.println("Enter coordinates");
            int y1 = sc.nextInt();
            int x1 = sc.nextInt();
            board.showCard(x1, y1);
            System.out.println("Enter second coordinates");
            int y2 = sc.nextInt();
            int x2 = sc.nextInt();
            board.showCard(x2, y2);
            moves--;
            System.out.println();
            System.out.println("Moves: " + moves);
            if(board.getPositionValue(x1, y1) != board.getPositionValue(x2, y2)){
                board.hideCard(x1, y1);
                board.hideCard(x2, y2);
                board.printBoard();
            }
        }
        System.out.println("Game over!");
    }
}
