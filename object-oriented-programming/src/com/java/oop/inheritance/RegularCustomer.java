package com.java.oop.inheritance;

public class RegularCustomer extends Customer{
    int shippingCharges = 50;
    String memberShip = "Silver";

    public RegularCustomer(int id, String name, String gender, String emailAddress, String address, byte age, long mobileNumber, int shippingCharges, String memberShip) {
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