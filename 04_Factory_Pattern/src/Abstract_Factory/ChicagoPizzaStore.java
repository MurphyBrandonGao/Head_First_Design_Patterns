package Abstract_Factory;

/**
 * @author Dell
 * @create 2019-05-24 14:42
 */
public class ChicagoPizzaStore extends PizzaStore {

    Pizza pizza;
    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {

            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}
