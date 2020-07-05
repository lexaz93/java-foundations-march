package factory;

public class PizzaShop {

    private final PizzaFactory pizzaFactory;

    public PizzaShop(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.makeDough();
        pizza.makeFilling();
        pizza.bake();

        System.out.println("Ваша пицца готова! Ждем Вас снова!");
        return pizza;
    }


}
