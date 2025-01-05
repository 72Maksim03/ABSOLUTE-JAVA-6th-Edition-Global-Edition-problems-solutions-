import java.util.Scanner;

public class Simulation {
    private Organism[][] world;
    private Position[] predators;
    private Position[] prey;
    private int numOfPredators;
    private int numOfPrey;

    public Simulation(int n){
        world = new Organism[n][n];
        predators = new Position[n * n];
        prey = new Position[n * n];
        numOfPredators = 0;
        numOfPrey = 0;
    }
    public Simulation(){this(20);}

    public void fill(int numOfPrey, int numOfPredator){
        this.numOfPredators = numOfPredator;
        this.numOfPrey = numOfPrey;

        for (int i = 0; i < numOfPredator; i++){
            int x = (int)(Math.random() * world.length);
            int y = (int)(Math.random() * world.length);
            while (world[x][y]!= null){
                x = (int)(Math.random() * world.length);
                y = (int)(Math.random() * world.length);
            }
            predators[i] = new Position(x, y);
            world[x][y] = new Doodlebugs(x, y);
        }

        for (int i = 0; i < numOfPrey; i++){
            int x = (int)(Math.random() * world.length);
            int y = (int)(Math.random() * world.length);
            while (world[x][y]!= null){
                x = (int)(Math.random() * world.length);
                y = (int)(Math.random() * world.length);
            }
            prey[i] = new Position(x, y);
            world[x][y] = new Ant(x, y);
        }
    }

    private void move(){
        for (int i = 0; i < numOfPredators; i++){
            Position p = predators[i];
            if (p == null) continue;
            String[] status = world[p.getX()][p.getY()].move(world, i, prey, predators);

            if (checkStatus(status, "kill")) numOfPrey--;
            if (checkStatus(status, "died")) numOfPredators--;
            if (checkStatus(status, "breed")) numOfPredators++;
        }

        for (int i = 0; i < numOfPrey; i++){
            Position p = prey[i];
            if (p == null) continue;
            String[] status = world[p.getX()][p.getY()].move(world, i, prey, predators);

            if (checkStatus(status, "breed")) numOfPrey++;
        }
    }

    private boolean checkStatus(String[] status, String check){
        for (int i = 0; i < status.length; i++)
            if (status[i].equalsIgnoreCase(check)) return true;

        return false;
    }

    public void simulate(){
        Scanner sc = new Scanner(System.in);
        while (numOfPredators > 0 && numOfPrey > 0) {
            printWorld();
            System.out.println("Number of predators: " + numOfPredators);
            System.out.println("Number of preys: " + numOfPrey);
            System.out.println("Press enter to continue simulation");
            String input = sc.nextLine();
            if (!input.isEmpty()) break;
            move();
        }
        printWorld();
        System.out.println("Number of predators: " + numOfPredators);
        System.out.println("Number of preys: " + numOfPrey);
    }

    private void printWorld(){
        for (int i = 0; i < world.length; i++){
            for (int j = 0; j < world.length; j++){
                if (world[i][j] == null) System.out.print(" ");
                else if (world[i][j] instanceof Doodlebugs) System.out.print("X");
                else System.out.print("O");
            }
            System.out.println();
        }
    }
}
