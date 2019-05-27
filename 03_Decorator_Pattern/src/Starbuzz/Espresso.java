package Starbuzz;

/**
 * @author Dell
 * @create 2019-05-19 0:26
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
