package Exceptions;

public class NoMoreProductsException extends Exception{

    @Override
    public String getMessage(){
        return "Out of stock!";
    }
}
