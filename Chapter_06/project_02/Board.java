import java.util.ArrayList;

public class Board {
    private Position[][] board;
    private int boardSize;

    public Board(int boardSize){
        board = new Position[boardSize][boardSize];
        this.boardSize = boardSize;
        initializeBoard();
    }

    private void initializeBoard() {
        ArrayList<Integer> list = new ArrayList<>();
        int maxNum = boardSize * boardSize / 2;
        for (int i = 1; i <= maxNum; i++){
            list.add(i);
            list.add(i);
        }

        for(int i = 0; i < boardSize; i++){
            for (int j = 0; j < boardSize; j++){
                int randomIndex = (int) (Math.random() * list.size());
                int value = list.get(randomIndex);
                list.remove(randomIndex);
                board[i][j] = new Position(value);
            }
        }
    }

    public void printBoard(){
        boolean check = true;
        System.out.printf("%4s", "");
        for (int i = 0; i < boardSize; i++) System.out.printf("%4s", i);
        System.out.println();
        for(int i = 0; i < boardSize; i++){
            System.out.printf("%4s", i);
            for (int j = 0; j < boardSize; j++){
                if (board[i][j].getShow()) System.out.printf("%4s", board[i][j].getCardsValue());
                else{
                    System.out.printf("%4s", board[i][j].getFace());
                    check = false;
                }
            }
            System.out.println();
        }
        if (check){
            System.out.println("YOU WON!");
            System.exit(0);
        }
    }
    public void showCard(int i, int j){
        if (i < 0 || i >= boardSize || j < 0 || j >= boardSize){
            System.out.println("Invalid coordinates");
            System.exit(0);
        }
        board[i][j].setShow(true);
        printBoard();
    }
    public void hideCard(int i, int j){
        if (i < 0 || i >= boardSize || j < 0 || j >= boardSize){
            System.out.println("Invalid coordinates");
            System.exit(0);
        }
        board[i][j].setShow(false);
    }
    public int getPositionValue(int i, int j){
        if (i < 0 || i >= boardSize || j < 0 || j >= boardSize){
            System.out.println("Invalid coordinates");
            System.exit(0);
        }
        return board[i][j].getCardsValue();
    }
}
