import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

    Principal principal = new Principal();
    principal.setName("Joseph");
    principal.setId(1);
    principal.setEmail("joe@gmail.com");
    principal.setAge(23);


    Course course = new Course("Maths");
    Course course2 = new Course("English");
    List<Course> courses = new <ArrayList>;();
    courses.add(course);
    courses.add(course2);


    Student student = new Student("magrat", 2, "mag@gmail.com", 18, StudentClass.SS1, true);

    principal.expel(student);
    }
}