public class Temperature {
    private double temperatureValue;
    private char scale;

    public Temperature(double temperatureValue, char scale){
        this.temperatureValue = temperatureValue;
        this.scale = scale;
    }

    public Temperature(){
        this.temperatureValue = 0;
        this.scale = 'C';
    }

    public Temperature(double temperatureValue){
        this.temperatureValue = temperatureValue;
        this.scale = 'C';
    }

    public Temperature(char scale){
        this.temperatureValue = 0;
        this.scale = scale;
    }

    public double getTemperatureInCelsius(){
        if(this.scale == 'C'){
            return this.temperatureValue;
        }
        return (this.temperatureValue - 32) * 5/9;
    }

    public double getTemperatureInFahrenheit(){
        if(this.scale == 'F'){
            return this.temperatureValue;
        }
        return (this.temperatureValue * 9/5) + 32;
    }

    public void setTemperature(double temperatureValue, char scale){
        this.temperatureValue = temperatureValue;
        this.scale = scale;
    }

    public void setTemperatureValue(double temperatureValue){
        this.temperatureValue = temperatureValue;
    }

    public void setScale(char scale){
        this.scale = scale;
    }

    public boolean equals(Temperature other){
        if(this.scale == 'C'){
            return this.temperatureValue == other.getTemperatureInCelsius();
        }
        return this.temperatureValue == other.getTemperatureInFahrenheit();
    }

    public boolean isGreater(Temperature other){
        if(this.scale == 'C'){
            return this.temperatureValue > other.getTemperatureInCelsius();
        }
        return this.temperatureValue > other.getTemperatureInFahrenheit();
    }

    public boolean isLess(Temperature other){
        if(this.scale == 'C'){
            return this.temperatureValue < other.getTemperatureInCelsius();
        }
        return this.temperatureValue < other.getTemperatureInFahrenheit();
    }

    public String toString(){
        return (this.temperatureValue + " " + this.scale);
    }
}
