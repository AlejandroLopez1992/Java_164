public class Pizza {
    int pizzaSize = 0;
    int numToppings = 0;
    double pizzaPrice = 0;
    double tax = 0;

    public void setSize(int size) {
        pizzaSize = size;
    }

    public void setToppings(int toppings) {
        numToppings = toppings;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void calculateBasePizzaPrice() {
        pizzaPrice = (6.5 * pizzaSize);
        pizzaPrice = pizzaPrice + (numToppings * .65);
    }

    public void addDeliveryFee(int delivery) {
        pizzaPrice += (delivery * 5);
    }

    public void addPizzaTax(int taxRate) {
        double taxRateDouble = taxRate;
        double taxAmount = pizzaPrice * (taxRateDouble/100);
        pizzaPrice = pizzaPrice + taxAmount;
    }

    public double getPrepTime() {
        double prepTime = (pizzaSize * 8) + (numToppings * 1.5);
        return prepTime;
    }
}