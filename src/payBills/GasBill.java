package com.company.payBills;

public class GasBill extends Bills{

    String advertisement;


    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement;
    }

    public GasBill(String advertisement,double cost, String currentReading, String previousReading) {
        super(cost, currentReading, previousReading);
        this.advertisement = advertisement;
    }




    @Override
    public void displayContent() {
        System.out.println("Previous reading= "+previousReading);
        System.out.println("Current reading= "+currentReading);
        System.out.println("Cost= "+cost+" pounds");
        System.out.println("Advertisement is "+advertisement);


    }
}
