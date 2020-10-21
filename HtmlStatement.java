import java.util.Enumeration;

public class HtmlStatement extends Statement {

    public String title(Customer aCustomer){
        String result = "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
        return result;
    }

    public String rentalValue(Rental each){
        String result = each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        return result;
    }

    public String footer(Customer aCustomer){
        String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
        return result;
    }
}