package Starbuzz;

/**
 * @author Dell
 * @create 2019-05-19 10:14
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
