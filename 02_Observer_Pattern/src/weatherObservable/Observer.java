package weatherObservable;

/**
 * @author Dell
 * @create 2019-04-16 10:16
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
