package SDP_Assignment_5;

//Part of Facade Pattern

// One of the complex library subsystems

class MembershipCard {
    protected String memberName;

    public MembershipCard(String name) {
        this.memberName = name;
    }

    public void checkStatus() {
        System.out.println("[Card] Reader Check: " + memberName);
        System.out.println("[Card] Status: active");
    }

    public void recordRental() {
        System.out.println("[Card] Rent recorded");
    }
}