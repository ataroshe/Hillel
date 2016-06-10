package java8Features;

import java.util.Optional;

/**
 * Created by User on 10.06.2016.
 */
public class Citizaen {
    Optional<Passport> passport = Optional.empty();

    public Optional<Passport> getPassport() {
        return passport;
    }
}
