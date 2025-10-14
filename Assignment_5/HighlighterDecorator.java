package SDP_Assignment_5;

//Part of Decorator Pattern

// One of the concrete decorators - additional services

class HighlighterDecorator extends BookDecorator {
    public HighlighterDecorator(Book book) {
        super(book);
    }

    public String getDescription() {
        return book.getDescription() + " with highlighter(marker for notes)";
    }

    public double getRentalPrice() {
        return book.getRentalPrice() + 100.0;
    }
}