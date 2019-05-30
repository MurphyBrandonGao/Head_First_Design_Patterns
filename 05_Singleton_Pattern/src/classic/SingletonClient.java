package classic;

/**
 * @author Dell
 * @create 2019-05-27 20:43
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getInstance().getDescription());
    }
}
