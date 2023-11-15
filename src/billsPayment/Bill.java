package billsPayment;

public abstract class Bill {

    private double cost;
    private double currentReading;
    private double previousReading;

    public Bill(double cost, double currentReading, double previousReading)
    {
        this.cost = cost;
        this.currentReading = currentReading;
        this.previousReading = previousReading;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCurrentReading(double currentReading)
    {
        this.currentReading = currentReading;
    }

    public double getCurrentReading()
    {
        return currentReading;
    }

    public void setPreviousReading(double previousReading)
    {
        this.previousReading = previousReading;
    }

    public double getPreviousReading()
    {
        return previousReading;
    }

    public abstract void displayContent();
}
