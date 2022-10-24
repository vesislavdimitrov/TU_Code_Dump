import java.util.Scanner;

public class Operations {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Customer customer = new Customer();

        System.out.println("Enter your name: ");
        customer.setName(scan.nextLine());

        System.out.println("Hello, "+customer.getName()+", What kind of an account do you have (VIP / Normal)?");
        String accountType = scan.nextLine();
        if(accountType.equalsIgnoreCase("Normal")){

            System.out.println("Please insert your account ID: ");
            customer.setAccount(new Account(scan.nextLine()));

            checkId(customer);
        }
        if(accountType.equalsIgnoreCase("VIP")){

            System.out.println("Please insert your account ID: ");
            customer.setAccount(new VIPAccount(scan.nextLine()));

            checkId(customer);

        }

        System.out.println("====================================");
        System.out.println("=/////////// OPERATIONS ///////////=");
        System.out.println("====================================");
        System.out.println("= Press '1' to check your balance  =");
        System.out.println("= Press '2' to deposit.            =");
        System.out.println("= Press '3' to withdraw            =");
        System.out.println("= Press '0' to pull out your card. =");
        System.out.println("====================================");

        for(;;)
        {
            int action = scan.nextInt();
            switch (action) {
                case 1 -> {
                    System.out.print("Current balance: ");
                    System.out.println(customer.account.getBalance());
                }
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    customer.account.deposit(scan.nextDouble());

                }
                case 3 -> {

                    if (customer.account instanceof VIPAccount){
                        System.out.print("Enter withdraw amount: ");
                        customer.account.withdraw(scan.nextDouble());
                    }
                    else{
                        if (customer.account.getBalance() > 0) {
                            System.out.print("Enter withdraw amount: ");
                            customer.account.withdraw(scan.nextDouble());
                        } else {
                            System.out.println("Not enough funds!");
                        }
                    }
                }
                case 0 -> {
                    System.out.println("====================================");
                    System.out.println("=    Banking operation finished.   =");
                    System.out.println("====================================");
                    System.out.print("Customer data: ");
                    customer.printCustomerData();
                }
            }
            if (action != 1 &&  action != 0 && action != 2 && action != 3)
            {
                System.out.println("Enter a valid action!");
            }
            if(action==0){
                break;
            }
        }
    }
    public static void checkId(Customer customer){

        while (customer.account.getId().equals("Invalid ID!")) {

            System.out.println("Please enter a valid 8-symbol id!");
            customer.setAccount(new Account(scan.nextLine()));
        }
    }

}
