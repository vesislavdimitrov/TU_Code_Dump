public class Account {

    private double balance;
    String id;

    Account(String id){

        setId(id);
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {

        if(id.length()==8){
            this.id = id;
        }
        else{
            this.id = "Invalid ID!";
        }

    }
    public void deposit(double amount){

        balance = balance+amount;
        System.out.println("Deposited successfully!");
    }
    public void withdraw(double amount){

        if(balance>0){
            if((balance - amount) <0){
                System.err.println("Not enough funds!");
                System.out.println("Your balance will be: "+ (getBalance() - amount));
            }
            else{
                balance = balance-amount;
                System.out.println("Withdrew successfully!");
            }
        }

    }








}
