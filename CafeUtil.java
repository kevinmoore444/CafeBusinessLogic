import java.util.ArrayList;
// import java.text.DecimalFormat;
public class CafeUtil {
    
    // Get Streak Goal
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i=1; i<=numWeeks; i++){
            sum = sum + i;
        }
        return sum;
    }
    // Get Order Total
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for (int i=0; i<prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    // Display Menu
    public void displayMenu(ArrayList<String> menuItems){
        System.out.println(menuItems);
    }

    // Add Customer
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello" + userName);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    // Print Price Chart
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        System.out.println("1 - " + price);
        for (int i=1; i<=maxQuantity-1; i++){
            System.out.println((i+1) + " - " + (price + ((price-0.5)*i)));
        }

    }
    // Display Menu
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() == prices.size()){
            for (int i=0; i<menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i) + "--" + prices.get(i)); 
            }
            return true;
        }
        else {
            return false;
        }
    }
}
