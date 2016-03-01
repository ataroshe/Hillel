package Figure;

import java.util.Arrays;

/**
 * Created by User on 26.02.2016.
 */
public class VetClinic {
    public static void main(String[] args) {
        Cat catTom = new Cat("Tom", "Blue", 2015);
        Cat catMurzik = new Cat("Murzik", "Grey", 2015);

        catTom.vaccinate("SACC");
        catMurzik.vaccinate("ACCD");

        catTom.setName("Jery");

        String name = catTom.getName();

        name.replace('T', 'K');

        System.out.println(catTom.getBirthYear());

    }


}
