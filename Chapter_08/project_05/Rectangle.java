public class Rectangle extends Figure {
    public Rectangle(int x, int y){super(x, y);}
    public Rectangle(){super();}

    public void erase(){
        System.out.println("Erasing rectangle");
    }
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
