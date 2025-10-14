package SDP_Assignment_5;

//Part of Facade Pattern

// One of the complex library subsystems

class NotificationSystem {
    public void sendReminder(String memberName, int days) {
        System.out.println("[Notifications] SMS sent to reader's number");
        System.out.println("[Notifications] Reminder: return book in " + days + " days");
    }
}