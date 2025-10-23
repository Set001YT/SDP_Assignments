package SDP_Assignment_6;

// One of the concrete strategies

class CourierDelivery implements DeliveryStrategy {
    private int baseCost = 500;
    private int costPerKm = 50;
    private int costPerKg = 10;

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public void setCostPerKm(int costPerKm) {
        this.costPerKm = costPerKm;
    }

    public void setCostPerKg(int costPerKg) {
        this.costPerKg = costPerKg;
    }

    @Override
    public double calculateCost(int distance, int weight) {
        return baseCost + (distance * costPerKm) + (weight * costPerKg);
    }

    @Override
    public String getDeliveryTime(int distance) {
        int hours = distance / 30;
        if (hours < 1) {
            return "within 1 hour";
        }
        return hours + " hours";
    }

    @Override
    public String getName() {
        return "Courier Delivery";
    }
}