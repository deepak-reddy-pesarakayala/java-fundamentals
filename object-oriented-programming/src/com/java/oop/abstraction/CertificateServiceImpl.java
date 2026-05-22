package com.java.oop.abstraction;

import javax.print.PrintService;

public class CertificateServiceImpl implements CertificateService{

    Attender attender;
    PrintService printService;

    CertificateServiceImpl(Attender attender,PrintService printService){
        this.attender = attender;
        this.printService = printService;
    }

    @Override
    public Certificate getCertificate(ApplicationForm applicationForm) {
        if(authenticate("admin", "admin@123")) {
            Certificate generatedCertificate = attender.processCertificate(applicationForm);
            printService.addPrintServiceAttributeListener(generatedCertificate);

            return generatedCertificate;
        } else
            return null;
    }


}