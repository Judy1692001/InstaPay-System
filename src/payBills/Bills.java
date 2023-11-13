package com.company.payBills;

abstract public class Bills {

    double cost ;
    String currentReading ;
    String previousReading;

    public Bills(double cost, String currentReading, String previousReading) {
        this.cost = cost;
        this.currentReading = currentReading;
        this.previousReading = previousReading;
    }

    abstract public void displayContent();
}
