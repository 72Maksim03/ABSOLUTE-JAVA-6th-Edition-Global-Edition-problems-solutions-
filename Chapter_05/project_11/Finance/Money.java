package Finance;

public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents){
        setDollars(dollars);
        setCents(cents);
    }

    public Money(int dollars){
        this(dollars, 0);
    }

    public Money(){
        this(0, 0);
    }

    public void setDollars(int dollars){
        if(dollars >= 0){
            this.dollars = dollars;
        }
    }

    public void setCents(int cents){
        if(cents >= 0){
            if(cents >= 100){
                this.dollars = this.dollars + cents/100;
                this.cents = cents % 100;
            } else{
                this.cents = cents;
            }
        }
    }

    public int getDollars(){
        return this.dollars;
    }

    public int getCents(){
        return this.cents;
    }

    public static Money add(Money m1, Money m2){
        Money result = new Money();
        int sumOfsents = m1.getCents() + m2.getCents();
        int sumOfDollars = m1.getDollars() + m2.getDollars() + sumOfsents/100;
        result.setDollars(sumOfDollars);
        result.setCents(sumOfsents%100);
        return result;
    }

    public static Money minus(Money m1, Money m2){
        Money result = new Money();
        if(m1.getDollars() < m2.getDollars() || (m1.getDollars() == m2.getDollars() &&
                m1.getCents() < m2.getCents())){
            System.out.println("Cannot be subtracted");
            return result;
        }
        int resDollars = m1.getDollars() - m2.getDollars();
        int resCents = m1.getCents() - m2.getCents();
        if(resCents < 0){
            resCents += 100;
            resDollars--;
        }
        result.setDollars(resDollars);
        result.setCents(resCents);
        return result;
    }

    public String toString(){
        return "$" + this.dollars + "." + this.cents;
    }

    public boolean equals(Money money){
        return (this.cents == money.getCents() && this.dollars == money.getDollars() );
    }

    public void add(Money m1){
        this.dollars += m1.getDollars();
        this.cents += m1.getCents();
        if(this.cents >= 100){
            this.cents -= 100;
            this.dollars++;
        }
    }

    public void subtract(Money m1){
        if(this.dollars < m1.getDollars() || (this.dollars == m1.getDollars() && this.cents < m1.getCents())){
            System.out.println("Cannot be subtracted");
            return;
        }
        this.dollars -= m1.getDollars();
        this.cents -= m1.getCents();
        if(this.cents < 0){
            this.cents += 100;
            this.dollars--;
        }
    }
}