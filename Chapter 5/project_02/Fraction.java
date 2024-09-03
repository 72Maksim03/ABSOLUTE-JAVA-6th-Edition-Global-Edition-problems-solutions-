/**
 * Represents a fraction with a numerator and a denominator.
 *
 * @author Maksim Petrosyan
 * */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Constructs a fraction with the given numerator and denominator
     *
     * @param numerator numerator of the fraction
     * @param denominator denominator of the fraction
     * */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Constructs a fraction with the same numerator and denominator as another fraction
     *
     * @param other another fraction
     * */
    public Fraction(Fraction other){
        this.numerator = other.getNumerator();
        this.denominator = other.getDenominator();
    }

    /**
     * sets the numerator of the fraction
     *
     * @param numerator the new numerator value
     * */
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    /**
     * sets the denominator of the fraction
     *
     * @param denominator the new denominator value
     * */
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    /**
     * Gets the numerator of the fraction
     *
     * @return the numerator of the fraction
     * */
    public int getNumerator(){
        return numerator;
    }

    /**
     * Gets the denominator of the fraction
     *
     * @return the denominator of the fraction
     * */
    public int getDenominator(){
        return denominator;
    }

    /**
     * Returns a string representation of the fraction in the form "numerator/denominator".
     *
     * @return a string representation of the fraction
     */
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }

    /**
     * Reduces the fraction to its lowest terms by dividing the numerator and denominator
     * by their greatest common divisor.
     */
    private void toLowestTerms(){
        int i = 2;
        while(i <= this.numerator){
            if(this.numerator % i == 0 && this.denominator % i == 0) {
                this.numerator = this.numerator / i;
                this.denominator = this.denominator / i;
            } else{
                i++;
            }
        }
    }

    /**
     * Checks if this fraction is equal to another fraction. Two fractions are considered
     * equal if they have the same numerator and denominator when both are reduced to their
     * lowest terms.
     *
     * @param other the fraction to compare to this fraction
     * @return true if the fractions are equal, false otherwise
     */
    public boolean equals(Fraction other){
        Fraction temp = new Fraction(other);
        Fraction tempForThis = new Fraction(this);
        temp.toLowestTerms();
        tempForThis.toLowestTerms();
        return (tempForThis.getNumerator() == temp.getNumerator() &&
                tempForThis.getDenominator() == temp.getDenominator());
    }
}
