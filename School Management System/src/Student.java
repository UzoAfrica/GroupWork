public class Student extends Person {

    private StudentClass studentClass;
    private List<Course> course;
    private Boolean isFight = false;

    public Student(String name, Integer id, String email, Integer age, StudentClass studentClass, List<Course> course, Boolean isFight) {
        super(name, id, email, age);
        this.studentClass = studentClass;
        this.course = course;
        this.isFight = isFight;
    }


    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public Boolean getFight() {
        return isFight;
    }

    public void setFight(Boolean fight) {
        isFight = fight;
    }
}
