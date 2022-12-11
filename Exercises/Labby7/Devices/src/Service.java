import java.util.ArrayList;
import java.io.*;

public class Service {

    //file paths
    private static final String devicesFilepath = System.getProperty("user.dir") + "devices.ser";
    private static final String brokenDevicesFilepath = System.getProperty("user.dir")+ "brokenDevices.ser";

    //data structures for devices
    private ArrayList<Device> devices;
    private ArrayList<BrokenDevice> brokenDevices;


    //getters and setters
    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public ArrayList<BrokenDevice> getBrokenDevices() {
        return brokenDevices;
    }

    public void setBrokenDevices(ArrayList<BrokenDevice> brokenDevices) {
        this.brokenDevices = brokenDevices;
    }

    public void writeToFile(ArrayList<Device> devices, ArrayList<BrokenDevice> brokenDevices){

        //serialize devices
        try(FileOutputStream fileOutputStream = new FileOutputStream(devicesFilepath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(devices);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        //serialize broken devices
        try(FileOutputStream fileOutputStream = new FileOutputStream(brokenDevicesFilepath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(brokenDevices);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public void readDataFromFile() {

        //deserialize devices
        try (FileInputStream fileInputStream = new FileInputStream(devicesFilepath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Object obj = objectInputStream.readObject();
            if (obj instanceof ArrayList<?> i) {
                if (i.get(0) != null && i.get(0) instanceof Device) {
                    setDevices((ArrayList<Device>) i);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        //deserialize broken devices
        try (FileInputStream fileInputStream = new FileInputStream(brokenDevicesFilepath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Object obj = objectInputStream.readObject();
            if (obj instanceof ArrayList<?> i) {
                if (i.get(0) != null && i.get(0) instanceof BrokenDevice) {
                    setBrokenDevices((ArrayList<BrokenDevice>) i);

                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void addNewDevice(Device device){
        this.devices.add(device);
    }

    public void addNewBrokenDevice(BrokenDevice brokenDevice){
        this.devices.add(brokenDevice);
    }

    public void printDevices(){
        System.out.println("Devices: \n"+ devices);
    }

    public void printBrokenDevices(){
        System.out.println("Broken Devices: \n"+ brokenDevices);
    }

    public String processRequest(boolean available){

        if(available){
            return "Request accepted!";
        }
        else{
            return "Request declined!";
        }
    }

    public void moveRepairedDevice(BrokenDevice brokenDevice){
        this.devices.add(brokenDevice);
        this.brokenDevices.remove(brokenDevice);
    }

    public double getTotalDevicePrice(){
        double sum=0;
        for(Device i: this.devices)  sum += i.getPrice();
        return  sum;
    }

    public double getIncome(double pricePerDay){
        double income=0;
        for(BrokenDevice i: this.brokenDevices){
            income = i.getPrice()*pricePerDay;
        }
        return income;
    }
}
