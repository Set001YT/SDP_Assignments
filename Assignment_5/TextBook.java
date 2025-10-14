package SDP_Assignment_5;

//Part of Decorator Pattern

// One of the simple basic books

class TextBook implements Book {
    private String title;

    public TextBook(String title) {
        this.title = title;
    }

    public String getDescription() {
        return "Textbook: " + title;
    }

    public double getRentalPrice() {
        return 800.0;
    }
}