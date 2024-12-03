public class Main {
    public static void main(String[] args) {
        Forecast forecast = new Forecast();

        forecast.setCity("Tbilisi");
        forecast.setWindSpeed(5.2);
        forecast.setRainPercentage(10.0);
        forecast.setIsRain(false);
        forecast.setIsCloud(true);
        forecast.setIsSunny(false);

        forecast.printInfo();

        System.out.println(forecast.isRecommendedForWalk() ? "You can go for a walk" : "I do not recommend going for a walk right now.");
    }
}