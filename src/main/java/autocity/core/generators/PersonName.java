package autocity.core.generators;

import autocity.core.Character;

import java.util.Random;

public class PersonName {
    public static String getString(Character character) {
        return "Gabe Newell " + (new Random().nextInt());
    }
}
