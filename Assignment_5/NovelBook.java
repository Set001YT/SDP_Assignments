package SDP_Assignment_5;

//Part of Decorator Pattern

// One of the simple basic books

class NovelBook implements Book {
    private String title;

    public NovelBook(String title) {
        this.title = title;
    }

    public String getDescription() {
        return "Novel: " + title;
    }

    public double getRentalPrice() {
        return 500.0;
    }
}