public class BookGiver extends Employee{
    private double startTime;
    private double endTime;

    public BookGiver(String name, String surname,String id, double startTime, double endTime) {
        super(name, surname, id);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }
}
