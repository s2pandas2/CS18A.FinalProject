public class BaseDrinks implements BaseBoba{
    private int defaultDrinkSize = 12;
    private double defaultDrinkPrice = 3.75;
    private String drinkType;
    private String Toppings[] = {"None", "Honey Boba", "Jello", "Lychee", "Red Bean"};

    public String setBaseDrinks(String drinkFlavor){
        this.drinkType = drinkFlavor;
        return drinkType;
    }


    public void sizeIncrease(){
        defaultDrinkSize = 16;
        defaultDrinkPrice = 4.25;
    }

    public double getDefaultDrinkPrice() {
        return defaultDrinkPrice;
    }

    public void setDefaultDrinkPrice(){
        defaultDrinkPrice = 3.75;
    }

    public int getDefaultDrinkSize(){
        return defaultDrinkSize;
    }

    public void setDefaultDrinkSize(){
        defaultDrinkSize = 12;
    }

    public void includedTopping(int t){ //else if to get their selection and price increase accordingly
        if(t == 0){
            return;
        }else if(t == 1){
            defaultDrinkPrice += .50;
        }else if(t == 2){
            defaultDrinkPrice += .65;
        }else if(t == 3){
            defaultDrinkPrice += .75;
        }else if(t == 4){
            defaultDrinkPrice += .60;
        }else
            return;
    }

    public void printDrink(int topping){
        System.out.println(drinkType);
        if(topping == 1 || topping == 2 || topping == 3 || topping == 4) { //skips the topping if it is none or not in
            System.out.println("+" + Toppings[topping]);                   // the array
        }
        System.out.println(getDefaultDrinkPrice());
    }
}


