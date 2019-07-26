import java.util.Scanner;
public class PoS{

    public static void main(String[] args){
        System.out.println("Welcome to Lina's Boba Shop!");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Would you like to order a cup of boba tea?(yes or no)");
        String yesOrno = myObj.nextLine();


        if(yesOrno.equals("yes")||yesOrno.equals("Yes")){ // used an if statement because it will check if the customer
                                                            // want some or not.
            BaseDrinks teaSelections = new BaseDrinks();
            System.out.println("Would you like regular or large?");
            String sizeYoN = myObj.nextLine();

            System.out.println("What type of flavored drink would you like?");
            System.out.println("1 for Jasmine milk tea");
            System.out.println("2 for Taro milk tea");
            System.out.println("3 for Green milk tea");
            System.out.println("4 for Honeydew milk tea");
            System.out.println("5 for Thai milk tea");

            int typeOfTea = myObj.nextInt();
            switch (typeOfTea){
                case 1:
                    teaSelections.setBaseDrinks("Jasmine milk tea");
                    break;
                case 2:
                    teaSelections.setBaseDrinks("Taro milk tea");
                    break;
                case 3:
                    teaSelections.setBaseDrinks("Green milk tea");
                    break;
                case 4:
                    teaSelections.setBaseDrinks("Honeydew milk tea");
                    break;
                case 5:
                    teaSelections.setBaseDrinks("Thai milk tea");
                    break;
                default:
                    teaSelections.setBaseDrinks("Milk tea");
            }

            if(sizeYoN.equals("large")){
                teaSelections.sizeIncrease(); //the price increase for size increase
            }


            System.out.println("Would you like a topping for the boba?"); //printing a selection of topping
            System.out.println("0 for none");
            System.out.println("1 for honey boba.");
            System.out.println("2 for Jello");
            System.out.println("3 for Lychee");
            System.out.println("4 for red bean");

            int top = myObj.nextInt();
            teaSelections.includedTopping(top);

            teaSelections.printDrink(top);

        }
        else{
            System.out.println("Have a wonderful day thank you!");
        }


    }
}
