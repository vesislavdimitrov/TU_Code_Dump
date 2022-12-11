import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Device> devices = new ArrayList<>();
        devices.add(new Device("make1","model1",234));
        devices.add(new Device("make2","model2",324));
        devices.add(new Device("make3","model3",423));

        ArrayList<BrokenDevice> brokenDevices = new ArrayList<>();
        brokenDevices.add(new BrokenDevice("make1","model1",234,"broken",3));
        brokenDevices.add(new BrokenDevice("make2","model2",324,"super broken", 6));
        brokenDevices.add(new BrokenDevice("make3","model3",423,"unfixable",10));

        Service service = new Service();

        service.writeToFile(devices,brokenDevices);
        service.readDataFromFile();

        System.out.println(service.getDevices());
        System.out.println(service.getBrokenDevices());

    }
}
