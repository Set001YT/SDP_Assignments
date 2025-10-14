package SDP_Assignment_5;

//Part of Decorator Pattern

// Abstract decorator

abstract class BookDecorator implements Book {
    protected Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }

    public String getDescription() {
        return book.getDescription();
    }

    public double getRentalPrice() {
        return book.getRentalPrice();
    }
}