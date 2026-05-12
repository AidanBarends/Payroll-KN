package za.ac.mycput.payrollkn.Util;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class Helper {

    public static boolean isNullOrEmpty(String string) {
        if (string == null || string.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(String email){
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }

    public static boolean isValidDate(LocalDate DOB){
        if(DOB == null){
            return false;
        }
        return true;
    }
}
