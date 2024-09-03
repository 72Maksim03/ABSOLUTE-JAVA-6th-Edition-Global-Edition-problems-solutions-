public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction other){
        this.numerator = other.getNumerator();
        this.denominator = other.getDenominator();
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public String toString(){
        return this.numerator + "/" + this.denominator;
    }

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

    public boolean equals(Fraction other){
        Fraction temp = new Fraction(other);
        temp.toLowestTerms();
        return (this.numerator == temp.getNumerator() && this.denominator == temp.getDenominator());
    }
}
