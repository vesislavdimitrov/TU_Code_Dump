public class House extends Building{

    private int floors;
    private String owner;


    public House(int height, double area, String address,int floors,String owner)
            throws FloorsException {
        super(height, area, address);
        setFloors(floors);
        this.owner=owner;

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) throws FloorsException {
        if(floors<=0){
            throw new FloorsException();
        }
        else {
            this.floors = floors;
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", owner='" + owner + '\'' +
                '}';
    }

    public static House getLargest(House[] houses)throws NullPointerException{
        House temp = null;
        double maxAvrHigh = 0;
        for (House house : houses) {
            if (house == null){
                throw new NullPointerException("House is non-existent!");
            }
            double avrHigh = house.getHeight()/house.getFloors();
            if (avrHigh > maxAvrHigh){
                maxAvrHigh = avrHigh;
                temp = house;
            }
        }
        return temp;
    }

    }
