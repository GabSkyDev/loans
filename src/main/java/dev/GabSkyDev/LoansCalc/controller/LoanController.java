package dev.GabSkyDev.LoansCalc.controller;

import dev.GabSkyDev.LoansCalc.model.Person;
import dev.GabSkyDev.LoansCalc.model.PersonResponse;
import dev.GabSkyDev.LoansCalc.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {
    @Autowired
    LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public ResponseEntity<PersonResponse> postPerson(@RequestBody Person person){
        PersonResponse bodyPerson = loanService.validatePerson(person);
        return new ResponseEntity<>(bodyPerson, HttpStatus.OK);
    }
}
