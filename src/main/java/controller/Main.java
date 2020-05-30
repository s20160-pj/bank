package controller;

import model.Account;
import model.Bank;
import model.User;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String Args[]) {
        Bank bank = new Bank(2244, "PKOBP");
        User user = new User(1, "Jan", "Kowalski", 25000d, 11111100001100110011110000d);
//        Account account = new Account( 1, "Jan", "Kowalski", 35000d, 11111100001100110011110000d);
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        System.out.println(validate);
    }
}
