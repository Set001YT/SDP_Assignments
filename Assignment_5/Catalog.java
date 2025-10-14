package SDP_Assignment_5;

//Part of Facade Pattern

// One of the complex library subsystems
class Catalog {
    public void searchBook(String title) {
        System.out.println("[Catalog] Search for book: " + title);
        System.out.println("[Catalog] Book found on shelf");
    }
}