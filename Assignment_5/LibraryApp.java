package SDP_Assignment_5;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade("Asset Iglikov");

// Order 1: A simple novel
        Book book1 = new NovelBook("War and Peace");
        library.borrowBook(book1, 14);

// Order 2: A textbook with a protective cover and a bookmark
        Book book2 = new TextBook("Algorithms and Data Structures");
        book2 = new ProtectiveCoverDecorator(new BookmarkDecorator(book2));
        library.borrowBook(book2, 30);

// Order 3: A novel with an audio version & bookmark
        Book book3 = new NovelBook("The Master and Margarita");
        book3 = new AudioVersionDecorator(new BookmarkDecorator(book3));
        library.borrowBook(book3, 21);

// Order 4: Full-Service Textbook
        Book book4 = new TextBook("Calculus");
        book4 = new ProtectiveCoverDecorator(new BookmarkDecorator(new HighlighterDecorator(new AudioVersionDecorator(book4))));
        library.borrowBook(book4, 60);
    }
}
