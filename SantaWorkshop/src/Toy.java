import java.util.Objects;

public class Toy {
    private String type;
    private int difficultyLevel;

    public Toy(String type, int difficultyLevel) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isChallenging(){
        return difficultyLevel > 7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return difficultyLevel == toy.difficultyLevel && Objects.equals(type, toy.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, difficultyLevel);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "type='" + type + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                '}';
    }
}
