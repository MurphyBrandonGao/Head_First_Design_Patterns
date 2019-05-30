package eagerly;

/**
 * @author Dell
 * @create 2019-05-27 21:01
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private static Singleton getInstance() {
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
