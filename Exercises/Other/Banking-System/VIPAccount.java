public class VIPAccount extends Account {

    private double balance;
    String id;

    VIPAccount(String id) {
        super(id);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {

        if(id.length()==8){
            this.id = id;
        }
        else{
            this.id = "Invalid ID!";
        }

    }
    @Override
    public void deposit(double amount){

        balance = balance+amount;
        System.out.println("Deposited successfully!");
    }
    @Override
    public void withdraw(double amount){


                balance = balance-amount;
                System.out.println("Withdrew successfully!");
    }

}






