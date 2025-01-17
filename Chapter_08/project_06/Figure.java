public abstract class Figure {
    private int centerX;
    private int centerY;
    private boolean centered = false;

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
        for (int i = 0; i < centerY; i++) System.out.println();
        centered = true;
        draw();
        centered = false;
    }

    protected boolean isCentered(){return this.centered;}
}
