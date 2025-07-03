package dev.GabSkyDev.LoansCalc.model;

import java.util.ArrayList;
import java.util.List;

public class PersonResponse {
    String customer;
    List<Loans> loans = new ArrayList<>();
    public PersonResponse(){

    }
    public PersonResponse(String customer, List<Loans> loans) {
        this.customer = customer;
        this.loans = loans;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Loans> getLoans() {
        return loans;
    }

    public void setLoans(List<Loans> loans) {
        this.loans = loans;
    }
}
