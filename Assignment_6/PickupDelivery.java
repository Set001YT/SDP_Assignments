package SDP_Assignment_6;

// One of the concrete strategies

class PickupDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(int distance, int weight) {
        return 0;
    }

    @Override
    public String getDeliveryTime(int distance) {
        return "today after 6 PM";
    }

    @Override
    public String getName() {
        return "Pickup";
    }
}