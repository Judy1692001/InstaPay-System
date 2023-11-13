package com.company.payBills;

public class ElectricityBill extends Bills{

    String locationName; // flat,shop,...
    double cleaningFees;


    public ElectricityBill(String locationName, double cleaningFees,double cost, String currentReading, String previousReading) {
        super(cost, currentReading, previousReading);
        this.locationName = locationName;
        this.cleaningFees = cleaningFees;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getCleaningFees() {
        return cleaningFees;
    }

    public void setCleaningFees(double cleaningFees) {
        this.cleaningFees = cleaningFees;
    }


    @Override
    public void displayContent() {
        System.out.println("Previous reading= "+previousReading);
        System.out.println("Current reading= "+currentReading);
        System.out.println("Cost= "+cost);
        System.out.println("Place describe is "+locationName);
        System.out.println("Cleaning fees = "+cleaningFees);

    }
}
