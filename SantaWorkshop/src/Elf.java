import java.util.Objects;

public class Elf extends WorkshopMember implements ChristmasCelebrator{
    private int skillLevel;
    private String elfType;


    public Elf(String name, String nickName, int age, int skillLevel, String elfType) {
        super(name, nickName, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getElfType() {
        return elfType;
    }

    public void setElfType(String elfType) {
        this.elfType = elfType;
    }

    @Override
    public void celebrateChristmas() {
        System.out.println("Merry Christmas!");
    }

    @Override
    public void hostChristmasParty(){
        System.out.println("We are hosting Christmas party!");
    }


    public void makeToy(){
        System.out.println("Elf made a toy.");
        increaseExperience();
    }

    public void wrapGifts(){
        System.out.println("Elf has wrapped a gift.");
        increaseExperience();
    }


    private void increaseExperience(){
        skillLevel++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Elf elf = (Elf) o;
        return skillLevel == elf.skillLevel && Objects.equals(elfType, elf.elfType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skillLevel, elfType);
    }

    @Override
    public String toString() {
        return "Elf{" +
                "skillLevel=" + skillLevel +
                ", elfType='" + elfType + '\'' +
                '}';
    }
}
