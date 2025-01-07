public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int x, int y, int w, int h){
        super(x, y);
        this.width = w;
        this.height = h;
    }
    public Rectangle(){this(0, 0, 5, 5);}

    public void erase(){
        for (int i = 0; i < 5; i++) System.out.println();
    }
    public void draw(){
        if (isCentered()) for (int k = 0; k < getCenterX(); k++) System.out.print(" ");

        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
        for (int i = 1; i < height - 1; i++){
            if (isCentered()) for (int k = 0; k < getCenterX(); k++) System.out.print(" ");

            System.out.print("*");
            for (int j = 1; j < width - 1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        if (isCentered()) for (int k = 0; k < getCenterX(); k++) System.out.print(" ");

        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
    }
}
