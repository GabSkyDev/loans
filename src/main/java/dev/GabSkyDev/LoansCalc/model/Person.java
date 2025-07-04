package dev.GabSkyDev.LoansCalc.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    Integer age;
    String cpf;
    String name;
    Double income;
    String location;
    List<Loans> loans = new ArrayList<>();
    public Person (){

    }
    public Person(Integer age, String cpf, String name, Double income, String location, List<Loans> loans) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
        this.loans = loans;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Loans> getLoans() {
        return loans;
    }

    public void setLoans(List<Loans> loans) {
        this.loans = loans;
    }
}
