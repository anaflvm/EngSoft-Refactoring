import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = title(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += rentalValue(each);
        }
        //add footer lines
        result += footer(aCustomer);
        return result;
    }

   public abstract String title(Customer aCustomer);

   public abstract String rentalValue(Rental each);

   public abstract String footer(Customer aCustomer);
}