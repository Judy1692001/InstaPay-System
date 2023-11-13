package com.company.BillsPayment;

abstract public class Bills {

    double cost ;
    String currentReading ;
    String previousReading;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(String currentReading) {
        this.currentReading = currentReading;
    }

    public String getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(String previousReading) {
        this.previousReading = previousReading;
    }

    public Bills(double cost, String currentReading, String previousReading) {
        this.cost = cost;
        this.currentReading = currentReading;
        this.previousReading = previousReading;
    }

    abstract public void displayContent();
}
