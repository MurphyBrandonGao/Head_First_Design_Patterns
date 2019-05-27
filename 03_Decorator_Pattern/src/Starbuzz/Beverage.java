package Starbuzz;

/**
 * @author Dell
 * @create 2019-05-19 0:21
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
