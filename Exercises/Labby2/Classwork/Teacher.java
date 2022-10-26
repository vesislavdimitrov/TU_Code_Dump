public class Teacher extends Person{

    Course course;

    Teacher(String name, String egn, Course course){

        super(name,egn);
        this.course = course;
    }

}


