public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf("Buddy", "Bud", 120, 5, "Woodworker");
        System.out.println(elf);
        elf.makeToy();
        elf.wrapGifts();


        Toy toy = new Toy("Train", 8);
        System.out.println(toy);
        System.out.println("Is challenging: " + toy.isChallenging());


        Reindeer reindeer = new Reindeer("Dasher", "Dash", 5, 90, "Red");
        System.out.println(reindeer);
        reindeer.fly();
        reindeer.trainForChristmas();
        System.out.println("Fitness Level: " + reindeer.checkFitnessLevel());


        Santa santa = new Santa("Saint Nicholas", "Santa", 2000);
        Child child1 = new Child("Irakli", 7);
        Child child2 = new Child("Nikoloz", 4);
        child1.addWish("New gaming PC");
        child1.addWish("Drive an F1 car.");
        child2.addWish("New Iphone 16");
        child2.addWish("New PS5");
        santa.addChild(child1);
        santa.addChild(child2);
        System.out.println("Nice List: " + santa.checkNaughtyOrNiceList());
        santa.deliverGifts();


        Snowman snowman = new Snowman(2.0, "Red", false);
        System.out.println(snowman);
        snowman.decorate("Scarf");
        snowman.melt();
        snowman.makeMagical();
    }
}