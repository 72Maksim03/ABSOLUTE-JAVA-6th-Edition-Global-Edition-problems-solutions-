public class Ant extends Organism{

    public Ant(int x, int y){
        super(x, y);
    }

    public String[] move(Organism[][] world, int index, Position[] preys, Position[] predators){
        int[] move = nextMove(getX(), getY(), world);
        String[] status = {""};
        if (move[0] == 0 && move[1] == 0) return status;
        world[getX() + move[0]][getY() + move[1]] = this;
        world[getX()][getY()] = null;
        this.setX(getX() + move[0]);
        this.setY(getY() + move[1]);

        preys[index].setX(getX());
        preys[index].setY(getY());

        incrementTime();
        if (getTime() % 3 == 0) return breed(world, preys);
        return status;
    }

    private String[] breed(Organism[][] world, Position[] preys){
        int[] nextCell = nextMove(getX(), getY(), world);
        String[] status = {""};
        if (nextCell[0] == 0 && nextCell[1] == 0) return status;

        int newX = getX() + nextCell[0];
        int newY = getY() + nextCell[1];
        Ant newAnt = new Ant(newX, newY);
        world[newX][newY] = newAnt;

        int num = 0;
        for (int i = 0; i < preys.length; i++){
            if (preys[i] != null) num++;
            else break;
        }

        preys[num] = new Position(newX, newY);

        status[0] = "breed";
        return  status;
    }

    private int[] nextMove(int cx, int cy, Organism[][] world){
        int[][] moves = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int randomIndex = (int)(Math.random() * moves.length);
        int count = 0;
        while((cx + moves[randomIndex][0]) >= world.length || (cx + moves[randomIndex][0] < 0) ||
                (cy + moves[randomIndex][1]) >= world.length || (cy + moves[randomIndex][1] < 0) ||
                world[cx + moves[randomIndex][0]][cy + moves[randomIndex][1]] != null){
            randomIndex = (randomIndex + 1) % moves.length;
            count++;
            if (count >= 3) return new int[]{0, 0};
        }
        return moves[randomIndex];
    }
}
