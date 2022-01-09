package IntermediateProjectImplementation;

import java.util.Random;

public class Gang {

    private Criminal[] criminals = new Criminal[2];
    private Random randomNumberGenerator = new Random();
    private double sumRobbedValue;

    Gang (){
        Item[] robItems =  new Item[2];
        robItems[0] = new Item("Swiss knife", 10.5 );
        robItems[2] = new Item("Apple rotten", 0.0 );
        Criminal rob = new Criminal("Rob", "The Head", 1976, "Breaking in",
                robItems);
        criminals[0] = rob;

        Item [] bobbyItems = new Item[2];
        bobbyItems[0] = new Item("Baseball Bat", 20.2);
        bobbyItems[1] = new Item("Toothpick", 0.5);
        Criminal bobby = new Criminal("Booby", "The mountain", 1978, "Knocking out",
                bobbyItems);
        criminals[1] = bobby;
    }
}
