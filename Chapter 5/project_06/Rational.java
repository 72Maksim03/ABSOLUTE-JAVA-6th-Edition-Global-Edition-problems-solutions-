/**
 * The Rational class represents a rational number (a fraction) with a numerator and a denominator.
 */
public class Rational {
    private int numerator;
    private int denumerator;

    /**
     * Constructs a Rational object with specified numerator and denominator.
     *
     * @param numerator   the numerator of the rational number
     * @param denumerator the denominator of the rational number
     */
    public Rational(int numerator, int denumerator) {
        setNumerator(numerator);
        setDenumerator(denumerator);
    }

    /**
     * Constructs a Rational object that represents a whole number.
     *
     * @param wholeNumber the whole number to be represented as a Rational number
     */
    public Rational(int wholeNumber) {
        setNumerator(wholeNumber);
        setDenumerator(1);
    }

    /**
     * Copy constructor that creates a Rational object as a copy of another Rational object.
     *
     * @param r1 the Rational object to copy
     */
    public Rational(Rational r1) {
        this.numerator = r1.getNumerator();
        this.denumerator = r1.getDenumerator();
    }

    /**
     * Sets the numerator of the rational number.
     *
     * @param numerator the new numerator
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Sets the denominator of the rational number and ensures it remains positive.
     * If both the numerator and denominator are negative, it normalizes the sign.
     *
     * @param denumerator the new denominator
     */
    public void setDenumerator(int denumerator) {
        if (this.numerator < 0 && denumerator < 0) {
            this.numerator = -this.numerator;
            this.denumerator = -this.denumerator;
        } else if (this.numerator > 0 && denumerator < 0) {
            this.numerator = -this.numerator;
            this.denumerator = Math.abs(denumerator);
        } else {
            this.denumerator = denumerator;
        }
    }

    /**
     * Returns the numerator of the rational number.
     *
     * @return the numerator
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * Returns the denominator of the rational number.
     *
     * @return the denominator
     */
    public int getDenumerator() {
        return this.denumerator;
    }

    /**
     * Reduces the rational number to its simplest form.
     */
    private void reduceFraction() {
        int min = Math.min(Math.abs(numerator), Math.abs(denumerator));
        int i = 2;
        while (min >= i) {
            if (this.numerator % i == 0 && this.denumerator % i == 0) {
                this.numerator /= i;
                this.denumerator /= i;
                min /= i;
            } else {
                i++;
            }
        }
    }

    /**
     * Returns the string representation of the rational number in the form "numerator/denominator".
     *
     * @return the string representation of the rational number
     */
    public String toString() {
        return this.numerator + "/" + this.denumerator;
    }

    /**
     * Checks whether two Rational objects are equal by comparing their reduced forms.
     *
     * @param r the Rational object to compare with
     * @return true if the two Rational objects are equal, false otherwise
     */
    public boolean equals(Rational r) {
        Rational temp1 = new Rational(r);
        Rational temp2 = new Rational(this);
        temp1.reduceFraction();
        temp2.reduceFraction();
        return (temp1.getNumerator() == temp2.getNumerator() && temp2.getDenumerator() == temp1.getDenumerator());
    }

    /**
     * Adds two Rational numbers and returns the result as a new Rational object.
     *
     * @param r1 the first rational number
     * @param r2 the second rational number
     * @return the sum of the two rational numbers
     */
    public static Rational add(Rational r1, Rational r2) {
        int resNumerator = r1.getNumerator() * r2.getDenumerator() + r2.getNumerator() * r1.getDenumerator();
        int resDenumerator = r1.getDenumerator() * r2.getDenumerator();
        Rational result = new Rational(resNumerator, resDenumerator);
        result.reduceFraction();
        return result;
    }

    /**
     * Subtracts one Rational number from another and returns the result as a new Rational object.
     *
     * @param r1 the first rational number
     * @param r2 the second rational number to subtract from the first
     * @return the result of the subtraction
     */
    public static Rational subtract(Rational r1, Rational r2) {
        int resNumerator = r1.getNumerator() * r2.getDenumerator() - r2.getNumerator() * r1.getDenumerator();
        int resDenumerator = r1.getDenumerator() * r2.getDenumerator();
        Rational result = new Rational(resNumerator, resDenumerator);
        result.reduceFraction();
        return result;
    }

    /**
     * Multiplies two Rational numbers and returns the result as a new Rational object.
     *
     * @param r1 the first rational number
     * @param r2 the second rational number
     * @return the product of the two rational numbers
     */
    public static Rational multiply(Rational r1, Rational r2) {
        int resNumerator = r1.getNumerator() * r2.getNumerator();
        int resDenumerator = r1.getDenumerator() * r2.getDenumerator();
        Rational result = new Rational(resNumerator, resDenumerator);
        result.reduceFraction();
        return result;
    }

    /**
     * Divides one Rational number by another and returns the result as a new Rational object.
     *
     * @param r1 the first rational number (numerator)
     * @param r2 the second rational number (denominator)
     * @return the result of the division
     */
    public static Rational divide(Rational r1, Rational r2) {
        int resNumerator = r1.getNumerator() * r2.getDenumerator();
        int resDenumerator = r1.getDenumerator() * r2.getNumerator();
        Rational result = new Rational(resNumerator, resDenumerator);
        result.reduceFraction();
        return result;
    }

    /**
     * Adds a Rational number to the current Rational object.
     *
     * @param r the rational number to add
     */
    public void add(Rational r) {
        this.numerator = this.numerator * r.getDenumerator() + r.getNumerator() * this.getDenumerator();
        this.denumerator = this.denumerator * r.getDenumerator();
        this.reduceFraction();
    }

    /**
     * Subtracts a Rational number from the current Rational object.
     *
     * @param r the rational number to subtract
     */
    public void subtract(Rational r) {
        this.numerator = this.numerator * r.getDenumerator() - r.getNumerator() * this.getDenumerator();
        this.denumerator = this.denumerator * r.getDenumerator();
        this.reduceFraction();
    }

    /**
     * Multiplies the current Rational object by another Rational number.
     *
     * @param r the rational number to multiply by
     */
    public void multiply(Rational r) {
        this.numerator = this.numerator * r.getNumerator();
        this.denumerator = this.denumerator * r.getDenumerator();
        this.reduceFraction();
    }

    /**
     * Divides the current Rational object by another Rational number.
     *
     * @param r the rational number to divide by
     */
    public void divide(Rational r) {
        this.numerator = this.numerator * r.getDenumerator();
        this.denumerator = this.denumerator * r.getNumerator();
        this.reduceFraction();
    }
}
