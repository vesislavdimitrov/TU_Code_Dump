public class Test {
    public static void main(String[] args) {

        Car car = new Car(290, "Golf Mk4", 123000, 310);
        Ship ship = new Ship(180, "X", 123000, 6700);
        Hovercraft hovercraft = new Hovercraft(180, "X", 123000, 14);

        ship.enterSea();
        System.out.println("Hovercraft promo: " + hovercraft.checkPromo());

    }
}
