public abstract class Figure {
    private int centerX;
    private int centerY;

    public Figure(int centerX, int centerY){
        this.centerX = centerX;
        this.centerY = centerY;
    }
    public Figure(){this(0, 0);}
    public int getCenterX(){return this.centerX;}
    public int getCenterY(){return this.centerY;}
    public void setCenterX(int centerX){this.centerX = centerX;}
    public void setCenterY(int centerY){this.centerY = centerY;}

    public abstract void erase();
    public abstract void draw();

    public void center(){
        erase();
        draw();
    }
}
