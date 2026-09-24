public class Main {

    public static void main(String[] args)
    {
        // Declarations
        double itemPrice;
        double shippingCost;
        double totalCost;
        final double salesTaxRate = 0.02;

        // It is assumed that the person enters valid price >= 0.
        System.out.println("Enter the price of the item: ");
        System.out.println("119.99");
        itemPrice = 119.99;

        if  (itemPrice >= 100) {
            shippingCost = 0.0;
        }
        else {
            shippingCost = salesTaxRate*itemPrice;
        }

        // The total cost is the item price plus the shipping cost.
        totalCost = itemPrice + shippingCost;

        // Print the shipping cost and the total price to the screen.
        System.out.println("The shipping cost is: " + shippingCost + ".  The total price is: $" + totalCost + ".");
    }
}