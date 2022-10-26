public class Test {

    public static void main(String[] args) {

        Teacher t1 = new Teacher
                ("Ivan Stamatov","0241117209", new Course("Maths", "First"));


        System.out.println(t1.getName()+" "+t1.getEgn()+" "+
                        t1.course.getSubject()+" "+t1.course.getCourse());











    }
}

