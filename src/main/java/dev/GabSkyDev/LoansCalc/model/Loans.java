package dev.GabSkyDev.LoansCalc.model;

public class Loans {
    LoanType type;
    Integer interest_rate;

    public Loans() {
    }

    public Loans(LoanType type, Integer interest_rate) {
        this.type = type;
        this.interest_rate = interest_rate;
    }

    public LoanType getType() {
        return type;
    }

    public void setType(LoanType type) {
        this.type = type;
    }

    public Integer getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(Integer interest_rate) {
        this.interest_rate = interest_rate;
    }
}
