public interface BaseBoba {
    public String setBaseDrinks(String drinkFlavor);
    public void sizeIncrease();
    public double getDefaultDrinkPrice();
    public void setDefaultDrinkPrice();
    public int getDefaultDrinkSize();
    public void setDefaultDrinkSize();
    public void includedTopping(int t);
    public void printDrink(int topping);
}
