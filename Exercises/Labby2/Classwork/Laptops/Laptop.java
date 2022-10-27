public class Laptop extends Device{
    private int hdd;
    private int ram;

    public Laptop(int vIn, String cpu, int hdd, int ram) {
        super(vIn, cpu);
        setHdd(hdd);
        setRam(ram);
    }

    public boolean isBetter(Laptop laptop){
        return this.hdd > laptop.getHdd() && this.ram > laptop.getRam();
    }

    @Override
    public String toString() {
        return "Laptop -> " +
                " Power supply: " + getvIn() +
                ", CPU model: " + getCpu() +
                ", HDD size:" + this.hdd +
                ", RAM size:" + this.ram;
    }

    public int getHdd() {
        return hdd;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
}