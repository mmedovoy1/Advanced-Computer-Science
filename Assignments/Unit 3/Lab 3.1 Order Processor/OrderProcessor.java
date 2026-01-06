public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();
            int quantity = item.getQuantity();

            // Calculate item total
            subtotal += itemTotal(item);

            // Check if expensive
            if (isExpensive(item)) {
                expensiveItemsTemp[premiumCount] = name;
                premiumCount += 1;
            }
        }

        // Trim premium items to exact size
        String[] expensiveItems = trimPremium(expensiveItemsTemp, premiumCount);

        // Calculate tax and total
        double tax = findTax(subtotal, taxRate);
        double total = findTotal(subtotal, tax);
        if (subtotal > 0) {
            tax = subtotal * taxRate;
            total = subtotal + tax;
        } else {
            tax = 0;
            total = 0;
        }

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    public static double itemTotal(Item item) {
        return item.getPrice() * item.getQuantity();
    }

    public static boolean isExpensive(Item item) {
        if (item.getPrice() > 50.0) {
                System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
                return true;
        } else {
            System.out.println(item.getName() + " is a regular item at $" + item.getPrice());
            return false;
        }
    }

    public static String[] trimPremium(String[] expensiveItemsTemp, int premiumCount) {
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }
        return expensiveItems;
    } 

    public static int findTax(int subtotal, int taxRate) {
        if (subtotal > 0) {
            return subtotal * taxRate;
        } else {
            return 0;
        }
    }
}