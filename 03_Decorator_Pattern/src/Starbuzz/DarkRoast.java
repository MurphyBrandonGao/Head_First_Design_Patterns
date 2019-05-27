package Starbuzz;

/**
 * @author Dell
 * @create 2019-05-19 10:29
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
