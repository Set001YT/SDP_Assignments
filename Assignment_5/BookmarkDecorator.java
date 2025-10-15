package SDP_Assignment_5;

//Part of Decorator Pattern

// One of the concrete decorators - additional services

class BookmarkDecorator extends BookDecorator {
    public BookmarkDecorator(Book book) {
        super(book);
    }

    public String getDescription() {
        return book.getDescription() + " + with bookmark ";
    }

    public double getRentalPrice() {
        return book.getRentalPrice() + 50.0;
    }
}
