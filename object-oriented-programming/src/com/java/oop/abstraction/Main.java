package com.java.oop.abstraction;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeListener;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "customer1", "customer1@gmail.com","2342323","2342342342323");
        ApplicationForm applicationForm = new ApplicationForm(1,"Birth Certificate",customer);
        Mro mro = new Mro(1,"MRO1",1000);
        Attender attender = new Attender(1,"attender1",1000,mro);
        PrintService printService = new PrintService() {
            @Override
            public String getName() {
                return "";
            }

            @Override
            public DocPrintJob createPrintJob() {
                return null;
            }

            @Override
            public void addPrintServiceAttributeListener(PrintServiceAttributeListener listener) {

            }

            @Override
            public void removePrintServiceAttributeListener(PrintServiceAttributeListener listener) {

            }

            @Override
            public PrintServiceAttributeSet getAttributes() {
                return null;
            }

            @Override
            public <T extends PrintServiceAttribute> T getAttribute(Class<T> category) {
                return null;
            }

            @Override
            public DocFlavor[] getSupportedDocFlavors() {
                return new DocFlavor[0];
            }

            @Override
            public boolean isDocFlavorSupported(DocFlavor flavor) {
                return false;
            }

            @Override
            public Class<?>[] getSupportedAttributeCategories() {
                return new Class[0];
            }

            @Override
            public boolean isAttributeCategorySupported(Class<? extends Attribute> category) {
                return false;
            }

            @Override
            public Object getDefaultAttributeValue(Class<? extends Attribute> category) {
                return null;
            }

            @Override
            public Object getSupportedAttributeValues(Class<? extends Attribute> category, DocFlavor flavor, AttributeSet attributes) {
                return null;
            }

            @Override
            public boolean isAttributeValueSupported(Attribute attrval, DocFlavor flavor, AttributeSet attributes) {
                return false;
            }

            @Override
            public AttributeSet getUnsupportedAttributes(DocFlavor flavor, AttributeSet attributes) {
                return null;
            }

            @Override
            public ServiceUIFactory getServiceUIFactory() {
                return null;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };

        //  CertificateService certificateService = new CertificateServiceImpl(attender);
        CertificateService certificateService = new CertificateServiceImpl2(mro,printService);
        Certificate certificate = certificateService.getCertificate(applicationForm);
        //printService.printCertificate(certificate);
        //CertificateService.username = "13234";

    }
}