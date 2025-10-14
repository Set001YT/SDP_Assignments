package SDP_Assignment_5;

//Part of Facade Pattern

// One of the complex library subsystems

class PaymentCounter {
    public void processPayment(double amount) {
        System.out.println("[Cashier] Rent payment: " + amount + " ₸");
        System.out.println("[Cashier] Payment successful");
    }
}