public class FirmET extends Firm
{
    String founder_name;
    double init_capital;
    double cr_capital;

    public double getCr_capital() {
        return cr_capital;
    }

    public void setCr_capital(double cr_capital) {
        this.cr_capital = cr_capital;
    }

    public double getInit_capital() {
        return init_capital;
    }

    public void setInit_capital(double init_capital) {
        this.init_capital = init_capital;
    }

    public String getFounder_name() {
        return founder_name;
    }

    public void setFounder_name(String founder_name) {
        this.founder_name = founder_name;
    }

    public static void main(String[] args)
    {
        FirmET firm1 = new FirmET();
        FirmET firm2 = new FirmET();

        firm1.setName("KebabSoft");
        firm1.setFounding_date("2003");
        firm1.setBulstat("1w3c5v7n8i");

        firm1.setFounder_name("Ali Raza");
        firm1.setInit_capital(200);
        firm1.setCr_capital(4560);

        firm1.displayData();

        System.out.println(firm1.profit());


    }
    public void displayData()
    {
        System.out.println(getName()+" "+getFounding_date()+" "+getBulstat()+" by "+getFounder_name());
        System.out.println(getInit_capital()+" "+getCr_capital());
    }
    public double profit()
    {
        return getCr_capital() - getInit_capital();
    }


}
