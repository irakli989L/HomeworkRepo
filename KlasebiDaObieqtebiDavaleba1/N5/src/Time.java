public class Time {
    int hours;
    int mins;
    int seconds;

    public Time(){
        this.hours = 16;
        this.mins = 35;
        this.seconds = 18;
    }

    public void displayInfo(){
        System.out.println(hours + " : " + mins + " : " + seconds);
    }
}
