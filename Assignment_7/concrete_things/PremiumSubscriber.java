package concrete_things;

import interfaces.*;

// Concrete Observer - Premium subscriber with extra features
public class PremiumSubscriber implements Subscriber {
    private String email;
    private String name;
    private boolean downloadPdf;

    public PremiumSubscriber(String name, String email, boolean downloadPdf) {
        this.name = name;
        this.email = email;
        this.downloadPdf = downloadPdf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDownloadPdf(boolean downloadPdf) {
        this.downloadPdf = downloadPdf;
    }

    @Override
    public void update(String articleTitle, String articleContent) {
        sendEmail(articleTitle, articleContent);
        if (downloadPdf) {
            generatePdf(articleTitle);
        }
    }

    @Override
    public String getEmail() {
        return email;
    }

    private void sendEmail(String title, String content) {
        System.out.println(" Premium Email sent to: " + name + " (" + email + ")");
        System.out.println(" Subject: [PREMIUM] " + title);
        System.out.println(" Full Content: " + content + "\n");
    }

    private void generatePdf(String title) {
        System.out.println(" PDF generated: " + title + ".pdf\n");
    }
}