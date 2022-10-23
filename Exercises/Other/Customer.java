public class Customer
{
    String name;
    Account account;
    Customer(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printCustomerData(){

        System.out.println(this.name+" "+this.account.getBalance()+" "+this.account.getId());

    }
    public void setAccount(Account account) {
        this.account = account;
    }



}
