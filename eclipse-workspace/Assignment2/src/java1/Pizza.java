package java1;



abstract class Pizza {
    private String type;
    private String toppings;
    private String name;
    private float timeForPreparation;
    private float costOfPizza;
    private String size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTimeForPreparation() {
        return timeForPreparation;
    }

    public void setTimeForPreparation(float timeForPreparation) {
        this.timeForPreparation = timeForPreparation;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    Pizza(String type, String toppings, String name, float timeForPreparation, float costOfPizza, String size, boolean hasToppings) throws InvalidPizzaSizeException, InvalidPizzaTypeException {
        if (type.equals("veg") || type.equals("nonVeg")) {
            this.type = type;
        } else {
            throw new InvalidPizzaTypeException("Invalid pizza type. Only 'veg' and 'nonVeg' are allowed.");
        }

        if (size.equals("small") || size.equals("medium")) {
            this.size = size;
        } else {
            throw new InvalidPizzaSizeException("Invalid pizza size. Only 'small' and 'medium' are allowed.");
        }

        this.toppings = toppings;
        this.name = name;
        this.timeForPreparation = timeForPreparation;
        this.costOfPizza = costOfPizza;
    }

    abstract int calculateCost();

    @Override
    public String toString() {
        return "[type: " + type + ", toppings: " + toppings + ", name: " + name + ", timeForPreparation: " + timeForPreparation + "]";
    }
}

class ItalianPizza extends Pizza {
    private boolean hasToppings;

    ItalianPizza(String type, String toppings, String name, float timeForPreparation, float costOfPizza, String size, boolean hasToppings) throws InvalidPizzaSizeException, InvalidPizzaTypeException {
        super(type, toppings, name, timeForPreparation, costOfPizza, size, hasToppings);
        this.hasToppings = hasToppings;
    }

    @Override
    int calculateCost() {
        int baseCost;
        int toppingsCost = 0;
        if (getType().equals("veg")) {
            baseCost = (getSize().equals("small")) ? 200 : 350;
        } else {
            baseCost = (getSize().equals("small")) ? 270 : 420;
        }
        if (hasToppings) {
            toppingsCost = 30;
        }
        return baseCost + toppingsCost;
    }

    @Override
    public String toString() {
        return "Italian Pizza details are: " +
                getType() + " with " + getToppings() +
                " toppings which take " + getTimeForPreparation() +
                " min for preparation.\nTotal Cost: $" + calculateCost();
    }
}

class MexicanPizza extends Pizza {
    private boolean hasToppings;

    MexicanPizza(String type, String toppings, String name, float timeForPreparation, float costOfPizza, String size, boolean hasToppings) throws InvalidPizzaSizeException, InvalidPizzaTypeException {
        super(type, toppings, name, timeForPreparation, costOfPizza, size, hasToppings);
        this.hasToppings = hasToppings;
    }

    @Override
    int calculateCost() {
        int baseCost;
        int toppingsCost = 0;

        if (getType().equals("veg")) {
            baseCost = (getSize().equals("small")) ? 200 : 350;
        } else {
            baseCost = (getSize().equals("small")) ? 270 : 420;
        }
        if (hasToppings) {
            toppingsCost = 30;
        }
        return baseCost + toppingsCost;
    }

    @Override
    public String toString() {
        return "Mexican Pizza details are: " +
                getType() + " with " + getToppings() +
                " toppings which take " + getTimeForPreparation() +
                " min for preparation.\nTotal Cost: $" + calculateCost();
    }
}
