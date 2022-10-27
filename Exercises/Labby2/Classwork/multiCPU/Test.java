public class Test {

    public static void main(String[] args) {

        MultiProcessor mCpu = new MultiProcessor(4,16,4200);

        double time = 45;
        System.out.printf("%.2f\n",mCpu.processTime(time));

        System.out.println(mCpu);

    }
}
