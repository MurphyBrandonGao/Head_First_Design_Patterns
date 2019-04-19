package weather;

import weather.Observer;

/**
 * @author Dell
 * @create 2019-04-16 10:14
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
