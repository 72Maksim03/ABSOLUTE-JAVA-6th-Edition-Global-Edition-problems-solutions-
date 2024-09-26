package MainPackage;
import Finance.Money;
import MyMath.Rational;

public class Main {
    public static void main(String[] args) {
        Money m1 = new Money(100, 80);
        Money m2 = new Money(60, 90);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(Money.add(m1, m2));
        System.out.println(Money.minus(m1, m2));

        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(Rational.add(r1, r2));
        System.out.println(Rational.subtract(r1, r2));
    }
}
