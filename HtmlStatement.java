import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = title(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += rentalValues(each);
        }
        //add footer lines
        result += footer(aCustomer);
        return result;
    }

    public String title(Customer aCustomer){
        String result = "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
        return result;
    }

    public String rentalValues(Rental each){
        String result = each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        return result;
    }

    public String footer(Customer aCustomer){
        String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
        return result;
    }
}