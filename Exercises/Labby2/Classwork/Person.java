public class Person {

    private String name;
    private String egn;

    public Person() {
        this.name = "";
        this.egn = "";
    }

    public Person(String name, String egn) {
        this.name = name;
        this.egn = egn;
    }

    public void sayName() {
        System.out.println("My name is: " + this.name);
    }

    public static void sayHi() {
        System.out.println("Hello");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getEgn() {
        return this.egn;
    }

    public void setEgn(String e) {
        this.egn = e;
    }
}
