public class Triangle extends Figure{
    public Triangle(int x, int y){super(x, y);}
    public Triangle(){super();}

    public void erase(){
        System.out.println("Erasing triangle");
    }
    public void draw(){
        System.out.println("Drawing triangle");
    }
}
