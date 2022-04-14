package com.example.crimereporter;

public class Case {
    String mobnouccc,vicnameuccc,descuccc,idcc;
    public Case(){

    }

    public Case(String idcc, String mobnoucc, String vicnameucc, String descucc) {
        this.mobnouccc = mobnouccc;
        this.vicnameuccc = vicnameucc;
        this.idcc = idcc;
        this.descuccc = descucc;
    }

    public String getMobnouccc() {
        return mobnouccc;
    }

    public String getVicnameuccc() {
        return vicnameuccc;
    }

    public String getDescuccc() {
        return descuccc;
    }

    public String getIdcc() {
        return idcc;
    }
}
