package billsPayment;

import billsPayment.Bill;

public class ElectricityBill extends Bill {

    private String locationName;
    private double cleaningFees;

    public ElectricityBill(double cost, double currentReading, double previousReading, String locationName, double cleaningFees)
    {
        super(cost, currentReading, previousReading);
        this.locationName = locationName;
        this.cleaningFees = cleaningFees;
    }

    public void setLocationName(String locationName)
    {
        this.locationName = locationName;
    }

    public String getLocationName()
    {
        return locationName;
    }

    public void setCleaningFees(double cleaningFees)
    {
        this.cleaningFees = cleaningFees;
    }

    public double getCleaningFees()
    {
        return cleaningFees;
    }
    @Override
    public void displayContent() {
        System.out.println("Displaying your ElectricityBill..");
        System.out.println("Cost: " + getCost());
        System.out.println("Current Reading: " + getCurrentReading());
        System.out.println("Previous Reading: " + getPreviousReading());
        System.out.println("Location Name: " + getLocationName());
        System.out.println("Cleaning Fees: " + getCleaningFees());
    }
}
