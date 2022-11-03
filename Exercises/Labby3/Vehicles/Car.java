
public class Car extends Vehicle implements IsLandVehicle{

    private int horsePower;
    public Car(int maxSpeed, String model, double price, int enginePower) {
        super(maxSpeed, model, price);
        this.horsePower = enginePower;
    }

    public int getEnginePower() {
        return horsePower;
    }

    public void setEnginePower(int enginePower) {
        this.horsePower = enginePower;
    }

    @Override
    public void enterLand() {
        System.out.println("Done!");
    }

    @Override
    public double checkPromo() {
        return this.getPrice() + this.getPrice() * 2/10;
    }
}