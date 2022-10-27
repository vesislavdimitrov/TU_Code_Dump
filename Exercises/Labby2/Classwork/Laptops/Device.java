public class Device {

    private int vIn;
    private String cpu;


    public Device(int vIn, String cpu) {
        this.vIn = vIn;
        this.cpu = cpu;
    }

    public int getvIn() {
        return vIn;
    }

    public void setvIn(int vIn) {
        this.vIn = vIn;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

}


