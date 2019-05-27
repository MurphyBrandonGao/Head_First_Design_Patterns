package Starbuzz;

/**
 * @author Dell
 * @create 2019-05-19 10:24
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(); // 订一杯Espresso，不需调料
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast(); // 订一杯DarkRoast
        beverage1 = new Mocha(beverage1); // 用Mocha装饰它
        beverage1 = new Mocha(beverage1); // 用第二个Mocha装饰它
        beverage1 = new Whip(beverage1); // 用Whip装饰它
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend(); // 订一杯调料为豆浆，摩卡，奶泡的HouseBlend咖啡
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
