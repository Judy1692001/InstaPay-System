package billsPayment;

import billsPayment.Bill;

public class WaterBill extends Bill {

    private String section;
    private String maintenance;

    public WaterBill(double cost, double currentReading, double previousReading, String section, String maintenance)
    {
        super(cost, currentReading, previousReading);
        this.section = section;
        this.maintenance = maintenance;
    }

    public void setSection(String section)
    {
        this.section = section;
    }

    public String getSection()
    {
        return section;
    }

    public void setMaintenance(String maintenance)
    {
        this.maintenance = maintenance;
    }

    public String getMaintenance()
    {
        return maintenance;
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying your WaterBill..");
        System.out.println("Cost: " + getCost());
        System.out.println("Current Reading: " + getCurrentReading());
        System.out.println("Previous Reading: " + getPreviousReading());
        System.out.println("Section: " + getSection());
        System.out.println("Maintenance: " + getMaintenance());
    }
}