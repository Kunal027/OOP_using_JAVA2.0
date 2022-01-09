package IntermediateProjectImplementation;

public class Detective extends Person{

    public static final int SUCCESS_PERCENTAGE = 20;
    public Detective(String name, String nickName, int yearOfBorn, String expertIn, Item[] item) {
        super(name, nickName, yearOfBorn, expertIn, item);
    }

    @Override
    public void printBioData() {
        System.out.println("Detective : ");
        super.printBioData();
    }
}
