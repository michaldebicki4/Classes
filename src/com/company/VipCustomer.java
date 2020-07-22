package com.company;

public class VipCustomer {
    private String name;
    private double limitCredit;
    private String emailAdress;

    public VipCustomer(String name, double limitCredit, String emailAdress) {
        this.name = name;
        this.limitCredit = limitCredit;
        this.emailAdress = emailAdress;
    }

    public VipCustomer() {
        this("defaultname", 90, "defaultadress");
    }

    public VipCustomer(String name, double limitCredit) {
        this(name, limitCredit, "default");
        this.name = name;
        this.limitCredit = limitCredit;
    }


    public String getName() {
        return name;
    }

    public double getLimitCredit() {
        return limitCredit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
