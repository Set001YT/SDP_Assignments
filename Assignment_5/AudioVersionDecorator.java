package SDP_Assignment_5;

//Part of Decorator Pattern

// One of the concrete decorators - additional services

class AudioVersionDecorator extends BookDecorator {
    public AudioVersionDecorator(Book book) {
        super(book);
    }

    public String getDescription() {
        return book.getDescription() + " + audioversion";
    }

    public double getRentalPrice() {
        return book.getRentalPrice() + 300.0;
    }
}