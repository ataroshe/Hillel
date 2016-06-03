package pattern.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class Krishna implements God{
    @Override
    public void create() {
        System.out.println("Create universe instantly");
    }

    @Override
    public void heal() {
        System.out.println("Think you are healthy");
    }

    @Override
    public String getName() {
        return "Krishna";
    }
}
