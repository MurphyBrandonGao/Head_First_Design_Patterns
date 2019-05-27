package Starbuzz;

/**
 * @author Dell
 * @create 2019-05-19 10:31
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
