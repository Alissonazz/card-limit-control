package Bancario;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private double limit = 20000;
    private double currentLimit;
    private List<Shopping> shoppings;

    public Card() {
        this.limit = limit;
        this.currentLimit = limit;
        this.shoppings = new ArrayList<>();
    }

    public boolean launchPurchase (Shopping shoppings) {
        if (currentLimit >= shoppings.getValue()) {
            currentLimit -= shoppings.getValue();
            this.shoppings.add(shoppings);
            return true;
        }
        return false;
    }

    public List <Shopping> getShoppings() {
        return shoppings;
    }

    public double getLimit() {
        return limit;
    }

    public double getCurrentLimit() {
        return currentLimit;
    }
}
