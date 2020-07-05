package factory;

public class PizzaFactory {
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case ITALIA:
                pizza = new Italia();
            case MARGARITA:
                pizza = new Margarita();
            case WITHSEAFOOD:
                pizza = new WithSeafood();
        }

        return pizza;
    }
}
