public class Main {
    public static void main(String[] args) {
        Money m1 = new Money(5, 40);
        System.out.println(m1);
        Money m2 = new Money(5, 440);
        System.out.println(m2);
        Money m3 = Money.add(m1, m2);
        System.out.println(m3);
        Money m4 = Money.minus(m2, m1);
        System.out.println(m4);
        Money m5 = new Money(5, 40);
        Money m6 = new Money(5, 40);
        m5.add(m6);
        System.out.println(m5);
        m6.subtract(m1);
        System.out.println(m6);
    }
}
