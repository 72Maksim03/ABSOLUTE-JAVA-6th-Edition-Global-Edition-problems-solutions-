public class Triangle extends Figure{
    private int height;

    public Triangle(int x, int y, int height){
        super(x, y);
        this.height = height;
    }
    public Triangle(){this(0, 0, 5);}

    public void erase(){
        for (int i = 0; i < 5; i++) System.out.println();
    }
    public void draw(){
        if (isCentered()) for (int i = 0; i < getCenterX(); i++) System.out.print(" ");

        for (int i = 0; i < this.height - 1; i++) System.out.print(" ");
        System.out.println("*");

        for (int i = 1; i < this.height - 1; i++){
            if (isCentered()) for (int k = 0; k < getCenterX(); k++) System.out.print(" ");

            for (int j = 0; j < this.height - 1 - i; j++) System.out.print(" ");

            System.out.print("*");

            for (int j = 0; j < 2 * i - 1; j++) System.out.print(" ");
            System.out.println("*");
        }

        if (isCentered()) for (int k = 0; k < getCenterX(); k++) System.out.print(" ");
        for (int i = 0; i < this.height; i++) System.out.print("* ");
    }
}
