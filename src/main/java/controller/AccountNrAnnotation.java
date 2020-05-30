package controller;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AccountNrValidation.class)
public @interface AccountNrAnnotation {
    public double accountNrAnnotation() default 11000011110000111100001111d;
    String message() default "Wrong account number format";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
