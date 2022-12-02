package Util;


import Exceptions.WrongPhoneNumberException;
import Interfaces.ValidatePhone;

public class Provider implements ValidatePhone {

    private String name;
    private String phoneNumber;

    public Provider(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if(phoneNumber.length()<10 || phoneNumber.contains("[a-z]")){
            throw new WrongPhoneNumberException();
        }
        else{
            return true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
