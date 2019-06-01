package Simple_Remote;

/**
 * @author Dell
 * @create 2019-05-27 21:15
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
