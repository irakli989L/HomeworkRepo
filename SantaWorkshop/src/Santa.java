import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit{
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<>();
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void addChild(Child child){
        childrenList.add(child);
    }

    public void deliverGifts(){
        System.out.println("Santa has delivered gifts to those who deserve (and to those who didnt skill issue)");
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> goodChildren = new ArrayList<>();
        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) {
                goodChildren.add(child);
            }
        }
        return goodChildren;
    }

    @Override
    public void spreadJoy() {
        System.out.println("Santa is spreading joy to the world!");
    }

    @Override
    public void singCarols() {
        System.out.println("Santa is singing Christmas carols!");
    }

    @Override
    public void decorateTree() {
        System.out.println("Put a tree");
        System.out.println("Get some toys and lights");
        System.out.println("Put toys on tree and lights around");
        System.out.println("Tada!");
    }
}
