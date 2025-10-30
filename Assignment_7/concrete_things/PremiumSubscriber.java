package concrete_things;

import interfaces.*;

// Concrete Observer - Premium subscriber
public class PremiumSubscriber implements Subscriber {
    private String email;
    private String name;
    private boolean downloadPdf;

    public PremiumSubscriber(String name, String email, boolean downloadPdf) {
        this.name = name;
        this.email = email;
        this.downloadPdf = downloadPdf;
    }

    @Override
    public void update(String blogName, String articleTitle, String articleContent) {
        sendEmail(blogName, articleTitle, articleContent);
        if (downloadPdf) {
            generatePdf(blogName, articleTitle);
        }
    }

    @Override
    public String getEmail() {
        return email;
    }

    private void sendEmail(String blogName, String title, String content) {
        System.out.println(" Premium Email to: " + name + " (" + email + ")");
        System.out.println(" From: " + blogName);
        System.out.println(" Subject: [PREMIUM] " + title);
        System.out.println(" Full Content: " + content + "\n");
    }

    private void generatePdf(String blogName, String title) {
        System.out.println(" PDF: " + blogName + "_" + title + ".pdf\n");
    }
}
