public class NoiseControl extends Employee{
    private double strictness;

    public NoiseControl(String name, String surname, String id, double strictness) {
        super(name, surname, id);
        this.strictness = strictness;
    }

    public double getStrictness() {
        return strictness;
    }

    public void setStrictness(double strictness) {
        this.strictness = strictness;
    }
}
