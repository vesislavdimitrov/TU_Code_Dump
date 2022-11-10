public class TV extends Products implements ElectricalAppliance {

    private String make;
    private String model;

    private double power;

    public TV(double price, String id,String make, String model,double power) throws PriceException, PowerException {
        super(price, id);
        this.make=make;
        this.model=model;
        setPower(power);
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power)throws PowerException {

        if(power<=0){
            throw new PowerException();
        }else{
            this.power = power;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double checkPromo() throws PriceException {

        this.setPrice(this.getPrice() - (this.getPrice()*9/100));
        return this.getPrice();
    }

    @Override
    public double checkExpense() {
        return this.getPower() / 30;
    }
}
