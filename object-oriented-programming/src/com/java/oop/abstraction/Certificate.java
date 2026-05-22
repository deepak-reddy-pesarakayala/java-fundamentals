package com.java.oop.abstraction;

import javax.print.event.PrintServiceAttributeEvent;
import javax.print.event.PrintServiceAttributeListener;

public class Certificate implements PrintServiceAttributeListener {
    int id;
    String name;
    String issuedBy;
    String issuedTo;
    String issuedDate;

    Certificate(int id, String name, String issuedBy, String issuedTo, String issuedDate){
        this.id = id;
        this.name = name;
        this.issuedBy = issuedBy;
        this.issuedTo = issuedTo;
        this.issuedDate = issuedDate;
    }

    @Override
    public void attributeUpdate(PrintServiceAttributeEvent psae) {

    }
}