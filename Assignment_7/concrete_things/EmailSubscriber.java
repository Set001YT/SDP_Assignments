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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void update(String articleTitle, String articleContent) {
        sendEmail(articleTitle, articleContent);
    }

    @Override
    public String getEmail() {
        return email;
    }

    private void sendEmail(String title, String content) {
        System.out.println(" Email sent to: " + name + " (" + email + ")");
        System.out.println(" Subject: New Article - " + title);
        System.out.println(" Preview: " + content.substring(0, Math.min(50, content.length())) + "...\n");
    }
}