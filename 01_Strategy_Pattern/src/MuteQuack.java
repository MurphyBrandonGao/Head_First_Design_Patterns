/**
 * @author Dell
 * @create 2019-04-08 15:31
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
