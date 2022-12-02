package Interfaces;

import Exceptions.WrongPhoneNumberException;

public interface ValidatePhone {

    boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException;
}
