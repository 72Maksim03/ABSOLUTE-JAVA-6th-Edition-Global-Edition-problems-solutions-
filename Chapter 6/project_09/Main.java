public class Main {
    public static void main(String[] args) {
        PartiallyFilledArray parr = new PartiallyFilledArray(2);
        parr.add(1.2);
        parr.add(2.3);
        System.out.println(parr.getElement(0));
        parr.resetElement(1, 3.4);
        System.out.println(parr.getElement(1));
        parr.add(4);
        System.out.println(parr.full());
    }
}
