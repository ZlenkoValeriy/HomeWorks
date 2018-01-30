import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {


        Cat cataracts = new Cat("Pushistic");
        System.out.println(cataracts.toString());
        cataracts.eat();
        cataracts.meow();
        cataracts.run();
        cataracts.sleep();


        HashMap<String, Cat> catHashMap = new HashMap<String, Cat>();

        catHashMap.put( "1", new Cat( "Vasya" ) );
        catHashMap.put( "2", new Cat( "Gosha" ));
        catHashMap.put( "3", new Cat( "Kesha" ) );
        catHashMap.put( "4", new Cat( "MURZIK" ) );
        catHashMap.put( "5", new Cat( "NEMURZIK" ));
        catHashMap.put( "6", new Cat( "Rizhiy" ) );
        catHashMap.put( "7", new Cat( "NeRizhiy" ) );
        catHashMap.put( "8", new Cat( "Numic" ));
        catHashMap.put( "9", new Cat( "Zunic" ) );
        catHashMap.put( "10", new Cat( "Halyava" ) );


        for (Map.Entry <String, Cat> stringCatEntry : catHashMap.entrySet()) {
            System.out.println(stringCatEntry.getKey() + "  " + stringCatEntry.getValue().toString());
        }


    }
}
