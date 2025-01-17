public abstract class Organism {
    private int x;
    private int y;
    private int time = 0;

    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void incrementTime(){time++;}
    public int getTime(){return time;}

    public int getX(){return this.x;}
    public int getY(){return this.y;}
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}

    public abstract String[] move(Organism[][] world, int index, Position[] preys, Position[] predators);
}