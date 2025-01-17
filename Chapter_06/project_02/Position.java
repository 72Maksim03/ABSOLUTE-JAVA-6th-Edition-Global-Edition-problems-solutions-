public class Position {
    private int cardsValue;
    private char face = '*';
    private boolean show = false;

    public Position(int cardsValue) {
        this.cardsValue = cardsValue;
    }
    public int getCardsValue(){return cardsValue;}
    public char getFace(){return face;}
    public void setShow(boolean sh){show = sh;}
    public boolean getShow(){return show;}
}
