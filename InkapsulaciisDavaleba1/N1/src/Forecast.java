public class Forecast {
    private String city;
    private double windSpeed;
    private double rainPercentage;
    private boolean isRain;
    private boolean isCloud;
    private boolean isSunny;

    public void setCity(String city) {
        this.city = city;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setRainPercentage(double rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public void setIsRain(boolean isRain) {
        this.isRain = isRain;
    }

    public void setIsCloud(boolean isCloud) {
        this.isCloud = isCloud;
    }

    public void setIsSunny(boolean isSunny) {
        this.isSunny = isSunny;
    }



    public void printInfo(){
        System.out.println("Here is today's weather report in "+city+":");
        if(isRain) System.out.println("Today is rainy day");
        else if(isCloud) System.out.println("Today is cloudy day");
        else if(isSunny) System.out.println("Today is sunny day");
        System.out.println("Current wind speed reaches up to "+windSpeed+"km/h");
        System.out.println("Rain covers "+rainPercentage+"% amount of city");
    }

    public boolean isRecommendedForWalk() {
        if (isRain || windSpeed > 20.0) return false;
        if (isSunny && windSpeed <= 10.0) return true;
        if (isCloud && windSpeed <= 15.0) return true;
        if (rainPercentage < 75 && windSpeed <= 17.5) return true;

        return false;
    }
}
