import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        
    CafeUtil appTest = new CafeUtil();


        /* ============ App Test Cases ============= */
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(19));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    


        //To Test this one you have to comment out the other tests.
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

    

        System.out.println("\n----- Print Price Chart-----");
        appTest.printPriceChart("Colombiran Coffee Grounds", 15.00, 3);
        

        System.out.println("\n----- Print Menu Prices-----");
        ArrayList<String> menu2 = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        menu2.add("drip coffee");
        menu2.add("cappuccino");
        menu2.add("latte");
        menu2.add("mocha");
        prices.add(2.50);
        prices.add(3.50);
        prices.add(4.50);
        prices.add(5.50);
        appTest.displayMenu(menu2, prices);
    }
}
