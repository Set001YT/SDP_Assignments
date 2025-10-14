package SDP_Assignment_5;

//Part of Facade Pattern

// Library facade
class LibraryFacade {
    private Catalog catalog;
    private MembershipCard card;
    private PaymentCounter payment;
    private NotificationSystem notification;

    public LibraryFacade(String memberName) {
        this.catalog = new Catalog();
        this.card = new MembershipCard(memberName);
        this.payment = new PaymentCounter();
        this.notification = new NotificationSystem();
    }

    public void borrowBook(Book book, int rentalDays) {
        System.out.println("\n========== Book issue ==========");
        System.out.println("Book: " + book.getDescription());
        System.out.println("Rental period: " + rentalDays + " days");
        System.out.println("======================================\n");

        catalog.searchBook(book.getDescription());
        card.checkStatus();
        payment.processPayment(book.getRentalPrice());
        card.recordRental();
        notification.sendReminder(card.memberName, rentalDays);

        System.out.println("\n✓ Book checked out! Enjoy!\n");
    }
}