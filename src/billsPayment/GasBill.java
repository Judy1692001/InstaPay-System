package billsPayment;

import billsPayment.Bill;

public class GasBill extends Bill {

    private String advertisements;

    public GasBill(double cost, double currentReading, double previousReading, String advertisements)
    {
        super(cost, currentReading, previousReading);
        this.advertisements = advertisements;
    }

    public void setAdvertisements(String advertisements)
    {
        this.advertisements = advertisements;
    }

    public String getAdvertisements()
    {
        return advertisements;
    }
    @Override
    public void displayContent() {
        System.out.println("Displaying your GasBill..");
        System.out.println("Cost: " + getCost());
        System.out.println("Current Reading: " + getCurrentReading());
        System.out.println("Previous Reading: " + getPreviousReading());
        System.out.println("Advertisements: " + getAdvertisements());
    }
}