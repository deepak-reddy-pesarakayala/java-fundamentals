package com.java.oop.abstraction;

import javax.print.PrintService;

public class CertificateServiceImpl2 implements CertificateService{

    Mro mro;
    PrintService printService;

    CertificateServiceImpl2(Mro mro, PrintService printService){
        this.mro = mro;
        this.printService = printService;
    }
    @Override
    public Certificate getCertificate(ApplicationForm applicationForm) {
        if(authenticate("admin", "admin@123")) {
            Certificate generatedCertificate = mro.generateCertificate(applicationForm);
            printService.printcertificate(generatedCertificate);
            return generatedCertificate;
        } else
            return null;
    }


}