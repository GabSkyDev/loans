package dev.GabSkyDev.LoansCalc.service;

import dev.GabSkyDev.LoansCalc.model.LoanType;
import dev.GabSkyDev.LoansCalc.model.Loans;
import dev.GabSkyDev.LoansCalc.model.Person;
import dev.GabSkyDev.LoansCalc.model.PersonResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {
    public PersonResponse validatePerson(Person person){
        person.setLoans(validateLoan(person));
        return toResponse(person);
    }

    public static List<Loans> validateLoan(Person person){
        List<Loans> loansList = new ArrayList<>();
        if (person.getIncome() <= 3000 || person.getIncome() >= 3000 && person.getIncome() <= 5000 && person.getAge() < 30 && person.getLocation().equals("SP")){
            Loans loan = new Loans(LoanType.PERSONAL, 4);
            loansList.add(loan);
            Loans loan2 = new Loans(LoanType.GUARANTEED, 3);
            loansList.add(loan2);
        }

        if (person.getIncome() >= 5000){
            Loans loan = new Loans(LoanType.CONSIGNMENT, 4);
            loansList.add(loan);
            Loans loan1 = new Loans(LoanType.PERSONAL, 2);
            loansList.add(loan1);
            Loans loan2 = new Loans(LoanType.GUARANTEED, 3);
            loansList.add(loan2);
        }

        return loansList;
    }

    public PersonResponse toResponse(Person person){
        PersonResponse personResponse = new PersonResponse();

        String customer = person.getName();
        List<Loans> loans = person.getLoans();
        personResponse.setCustomer(customer);
        personResponse.setLoans(loans);

        return personResponse;
    }
}
