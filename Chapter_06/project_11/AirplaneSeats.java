public class AirplaneSeats {
    private char[][] seats;
    private int size;

    public AirplaneSeats(int airplaneSize){
        size = airplaneSize;
        seats = new char[airplaneSize][4];
        for(int i = 0; i < airplaneSize; i++){
            seats[i][0] = 'A';
            seats[i][1] = 'B';
            seats[i][2] = 'C';
            seats[i][3] = 'D';
        }
    }

    public AirplaneSeats(){this(7);}

    public void printSeats(){
        for(int i = 0; i < size; i++){
            System.out.print((i + 1) + " ");
            for(int j = 0; j < 4; j++){
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void occupySeat(String seat){
        if (seat.length() != 2){
            System.out.println("Invalid seat");
            System.exit(0);
        }
        int col = seat.charAt(0) - '1';
        int row = seat.charAt(1) - 'A';
        if (col < 0 || col >= size || row < 0 || row >= 4){
            System.out.println("Seat not found");
            System.exit(0);
        }

        if (seats[col][row] != 'X'){
            seats[col][row] = 'X';
            System.out.println("Seat " + seat + " occupied");
        } else {
            System.out.println("Seat " + seat + " is already occupied");
        }
    }
}
