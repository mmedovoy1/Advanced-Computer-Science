import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
public class StandardTicket extends Ticket {
    
    // constructors
    public StandardTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    // methods
    public double getTotalPrice() {
        return (super.getTax() * super.getBasePrice() + super.getBasePrice()) * super.getTicketCount();
    }

    // abstract methods 
    public void printTicketType() {
        System.out.println("Ticket Type: Standard");
    }

    public void printPrice() {
        BigDecimal decimalFormatter = new BigDecimal(getTotalPrice()).setScale(2, RoundingMode.HALF_UP); // rounds totalPrice to 2 decimal places, will be 1 decimal place if last digit is 0 (i.e. 7.50 -> 7.5)

System.out.println("Ticket Price: $" + decimalFormatter.doubleValue()); // prints the price
    }

    public void printCancellationPolicy() {
        super.printCancellationPolicy();
        System.out.println("Can be canceled within 24 hours before the event. Cancellation fee applies.");
    }

    public void priintTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printCancellationPolicy();
    }
}
