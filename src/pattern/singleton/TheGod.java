package pattern.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class TheGod implements God {

    private static class Holder {
        static TheGod instance = new TheGod();
    }

    public static TheGod getInstance() {
     return Holder.instance;
    }

    private TheGod() {
        System.out.println("God had always been here!");
    }

    @Override
    public void create() {
        System.out.println("All the world in 7 days");
    }


    @Override
    public void heal() {
        System.out.println("Stand up and go!");
    }

    @Override
    public String getName() {
        return "God";
    }

    public static void prophet() {
        System.out.println("Jesus");
    }

//    public static void clear() {
//        instance = null;
//    }
}
