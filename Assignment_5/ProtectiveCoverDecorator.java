package SDP_Assignment_5;

//Part of Decorator Pattern

// One of the concrete decorators - additional services

class ProtectiveCoverDecorator extends BookDecorator {
    public ProtectiveCoverDecorator(Book book) {
        super(book);
    }

    public String getDescription() {
        return book.getDescription() + " in a protective cover ";
    }

    public double getRentalPrice() {
        return book.getRentalPrice() + 150.0;
    }
}