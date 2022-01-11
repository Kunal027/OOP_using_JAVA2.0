package IntermediateProjectImplementation;

public abstract class Person {
    private String name;
    private String nickName;
    private int yearOfBorn;
    private String expertIn;
    private Item[] item;

    public Person(String name, String nickName, int yearOfBorn, String expertIn, Item[] item) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.item = item;
    }

    public void printBioData(){
        System.out.println("Name : " + name + "(" + nickName + ")" );
        System.out.println("Year of born : " + yearOfBorn);
        System.out.println("Experts in : " + expertIn);
        System.out.println("The person has the following items : ");
        for (Item item : item) {
            System.out.println(" - " + item.getName());
        }
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

}
