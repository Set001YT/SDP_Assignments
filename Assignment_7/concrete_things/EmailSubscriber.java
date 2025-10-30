package concrete_things;

import interfaces.*;

// Concrete Observer - Email subscriber
public class EmailSubscriber implements Subscriber {
    private String email;
    private String name;

    public EmailSubscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String blogName, String articleTitle, String articleContent) {
        sendEmail(blogName, articleTitle, articleContent);
    }

    @Override
    public String getEmail() {
        return email;
    }

    private void sendEmail(String blogName, String title, String content) {
        System.out.println(" Email to: " + name + " (" + email + ")");
        System.out.println(" From: " + blogName);
        System.out.println(" Subject: " + title);
        System.out.println(" Preview: " + content.substring(0, Math.min(50, content.length())) + "...\n");
    }
}
