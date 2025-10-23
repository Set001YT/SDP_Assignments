package SDP_Assignment_6;

// One of the concrete strategies

class ExpressDelivery implements DeliveryStrategy {
    private int baseCost = 1500;
    private int costPerKm = 80;
    private int costPerKg = 30;
    private int maxDistance = 50;

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public void setCostPerKm(int costPerKm) {
        this.costPerKm = costPerKm;
    }

    public void setCostPerKg(int costPerKg) {
        this.costPerKg = costPerKg;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public double calculateCost(int distance, int weight) {
        if (distance > maxDistance) {
            throw new IllegalArgumentException("Express delivery only available within " + maxDistance + " km");
        }
        return baseCost + (distance * costPerKm) + (weight * costPerKg);
    }

    @Override
    public String getDeliveryTime(int distance) {
        if (distance > maxDistance) {
            return "not available";
        }
        return "2-3 hours";
    }

    @Override
    public String getName() {
        return "Express Delivery";
    }
}