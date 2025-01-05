public class Doodlebugs extends Organism {
    private int starve = 0;
    public Doodlebugs(int x, int y){
        super(x, y);
    }

    public String[] move(Organism[][] world, int index, Position[] preys, Position[] predators){
        String[] status = {"", "", ""};
        Ant died = null;
        int[] move = nextMove(getX(), getY(), world);
        if (move[0] == 0 && move[1] == 0) return status;
        if (world[getX() + move[0]][getY() + move[1]] instanceof Ant)
            died = (Ant) world[getX() + move[0]][getY() + move[1]];

        int num = 0;
        int killedIndex = 0;

        if (died != null){
            for(int i = 0; i < preys.length; i++){
                if (preys[i] != null) num++;
                else break;
            }

            for(int i = 0; i < num; i++)
                if (preys[i].getX() == died.getX() && preys[i].getY() == died.getY())
                    killedIndex = i;

            preys[killedIndex] = preys[num - 1];
            preys[num - 1] = null;
            status[2] = "kill";
        }


        world[getX() + move[0]][getY() + move[1]] = this;
        world[getX()][getY()] = null;
        this.setX(getX() + move[0]);
        this.setY(getY() + move[1]);

        predators[index].setX(getX());
        predators[index].setY(getY());
        incrementTime();
        starve++;

        if (died != null) starve = 0;
        if (starve >= 3) {
            die(world, predators, index);
            status[0] = "died";
        }
        if (getTime() % 8 == 0){
            breed(world, predators);
            status[1] = "breed";
        }

        return status;
    }

    private void die(Organism[][] world, Position[] predators, int index){
        world[getX()][getY()] = null;
        int num = 0;
        for(int i = 0; i < predators.length; i++){
            if (predators[i] != null) num++;
            else break;
        }
        predators[index] = predators[num - 1];
        predators[num - 1] = null;
    }

    private void breed(Organism[][] world, Position[] predators){
        int[] nextCell = posForBreed(getX(), getY(), world);
        if (nextCell[0] == 0 && nextCell[1] == 0) return;

        int num = 0;
        for(int i = 0; i < predators.length; i++){
            if (predators[i] != null) num++;
            else break;
        }

        int newX = getX() + nextCell[0];
        int newY = getY() + nextCell[1];
        Doodlebugs newDoodlebug = new Doodlebugs(newX, newY);
        world[newX][newY] = newDoodlebug;
        predators[num] = new Position(newX, newY);
    }

    private int[] nextMove(int cx, int cy, Organism[][] world){
        int[][] moves = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for (int i = 0; i < moves.length; i++)
            if (!((cx + moves[i][0]) >= world.length || (cx + moves[i][0] < 0) ||
                    (cy + moves[i][1]) >= world.length || (cy + moves[i][1] < 0)) &&
                    world[cx + moves[i][0]][cy + moves[i][1]] instanceof Ant) return moves[i];
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

    private int[] posForBreed(int cx, int cy, Organism[][] world){
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
