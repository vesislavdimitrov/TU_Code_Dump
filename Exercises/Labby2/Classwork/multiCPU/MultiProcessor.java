public class MultiProcessor {

    private int cpuCount;
    private int coreCount;
    private double clock;

    public MultiProcessor(int cpuCount,int coreCount, int clock){

        setCpuCount(cpuCount);
        setCoreCount(coreCount);
        setClock(clock);

    }

    public String toString(){
        return
                "CPU Count: " + getCpuCount()+"\n"+"CPU Cores: "+getCoreCount()+"\n"+"CPU Clock: "+getClock();
    }

    public double processFreq(){

        if(this.coreCount<=0){
            this.coreCount = 1;
        }
        if(this.cpuCount<=0){
            this.cpuCount =1;
        }
        return (0.7)*this.coreCount*0.8*this.cpuCount*this.clock;
    }
    public double processTime(double sec){

        return sec*this.clock/this.processFreq();
    }


    public double getClock() {
        return clock;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }
}