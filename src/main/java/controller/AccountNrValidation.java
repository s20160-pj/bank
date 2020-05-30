package controller;

import controller.AccountNrAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AccountNrValidation implements ConstraintValidator<AccountNrAnnotation, Double> {

    public void initialize(AccountNrAnnotation accountNrAnnotation) {

    }

    public boolean isValid(Double accountNr, ConstraintValidatorContext constraintValidatorContext) {
        return accountNr.toString().trim().length() != 26;
    }
}
