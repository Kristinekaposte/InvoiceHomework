public class Main {
    public static void main(String[] args) {
        // Creating an Invoice object
        Invoice invoice = new Invoice("1234", "Hammer", 3, 150);

        // Invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

        // Change some attributes
        invoice.setQuantity(5);
        invoice.setPricePerItem(100);

        // Updated invoice details
        System.out.println("\nUpdated Invoice Details:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

        // Change attributes to negative numbers
        invoice.setQuantity(-5);
        invoice.setPricePerItem(-40);

        // Updated invoice details to negative
        System.out.println("\nUpdated Invoice Details to negative numbers:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}