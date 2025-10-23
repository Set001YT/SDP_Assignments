package SDP_Assignment_6;

// One of the concrete strategies

class PostDelivery implements DeliveryStrategy {
    private int baseCost = 300;
    private int costPerKg = 20;

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public void setCostPerKg(int costPerKg) {
        this.costPerKg = costPerKg;
    }

    @Override
    public double calculateCost(int distance, int weight) {
        double cost = baseCost + (weight * costPerKg);
        if (distance > 100) {
            cost += (distance - 100) * 2;
        }
        return cost;
    }

    @Override
    public String getDeliveryTime(int distance) {
        int days = 3;
        if (distance > 100) {
            days += (distance / 100);
        }
        return days + " days";
    }

    @Override
    public String getName() {
        return "Post Delivery";
    }
}