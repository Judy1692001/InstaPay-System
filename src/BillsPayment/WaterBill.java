package com.company.BillsPayment;

public class WaterBill extends Bills{

    String section;
    String maintenance;


    public WaterBill(String section, String maintenance, double cost, String currentReading, String previousReading) {
        super(cost, currentReading, previousReading);
        this.section = section;
        this.maintenance = maintenance;
        this.cost = cost;
        this.currentReading = currentReading;
        this.previousReading = previousReading;
    }

    String previousReading ;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }



    @Override
    public void displayContent() {
         System.out.println("Previous reading= "+previousReading);
         System.out.println("Current reading= "+currentReading);
         System.out.println("Cost= "+cost);
         System.out.println("Section is "+section);
         System.out.println("and maintance is "+maintenance);


    }
}
