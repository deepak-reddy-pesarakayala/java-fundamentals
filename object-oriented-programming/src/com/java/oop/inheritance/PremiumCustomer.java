package com.java.oop.inheritance;

public class PremiumCustomer extends Customer{
    int shippingCharges = 0;
    String memberShip = "Gold";

    public PremiumCustomer(int id, String name, String gender, String emailAddress, String address, byte age, long mobileNumber, int shippingCharges, String memberShip) {
        super(id, name, gender, emailAddress, address, age, mobileNumber);
        this.shippingCharges = shippingCharges;
        this.memberShip = memberShip;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Shipping Charges: " + shippingCharges);
        System.out.println("Membership: " + memberShip);
    }
}